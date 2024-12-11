import { Sequelize, DataTypes, Model, Optional } from 'sequelize';


const sequelize = new Sequelize('hotel', 'root', '', {
    host: 'localhost',
    dialect: 'mysql',
    port: 3306
});


interface GuestAttributes {
  id: number;
  first_name: string;
  last_name: string;
  email: string;
  phone_number: string;
}

interface ReservationAttributes {
  id: number;
  check_in_date: Date;
  check_out_date: Date;
  total_cost: number;
  guest_id: number;
  room_id: number;
}

interface RoomAttributes {
  id: number;
  room_number: string;
  type: string;
  price_per_night: number;
  available: boolean;
}

interface GuestCreationAttributes extends Optional<GuestAttributes, 'id'> {}
interface ReservationCreationAttributes extends Optional<ReservationAttributes, 'id'> {}
interface RoomCreationAttributes extends Optional<RoomAttributes, 'id'> {}

class Guest extends Model<GuestAttributes, GuestCreationAttributes> implements GuestAttributes {
  public id!: number;
  public first_name!: string;
  public last_name!: string;
  public email!: string;
  public phone_number!: string;
}

class Reservation extends Model<ReservationAttributes, ReservationCreationAttributes> implements ReservationAttributes {
  public id!: number;
  public check_in_date!: Date;
  public check_out_date!: Date;
  public total_cost!: number;
  public guest_id!: number;
  public room_id!: number;
}

class Room extends Model<RoomAttributes, RoomCreationAttributes> implements RoomAttributes {
  public id!: number;
  public room_number!: string;
  public type!: string;
  public price_per_night!: number;
  public available!: boolean;
}

// Initialize the models
Guest.init(
  {
    id: {
      type: DataTypes.INTEGER.UNSIGNED,
      autoIncrement: true,  
      primaryKey: true,     
    },
    first_name: {
      type: DataTypes.STRING,
      allowNull: false,
    },
    last_name: {
      type: DataTypes.STRING,
      allowNull: false,
    },
    email: {
      type: DataTypes.STRING,
      allowNull: false,
    },
    phone_number: {
      type: DataTypes.STRING,
      allowNull: false,
    },
  },
  {
    sequelize,
    modelName: 'Guest',
    tableName: 'Guests',
    timestamps: false
  }
);

Room.init(
  {
    id: {
      type: DataTypes.INTEGER.UNSIGNED,
      autoIncrement: true,  
      primaryKey: true,     
    },
    room_number: {
      type: DataTypes.STRING,
      allowNull: false,
    },
    type: {
      type: DataTypes.STRING,
      allowNull: false,
    },
    price_per_night: {
      type: DataTypes.FLOAT,
      allowNull: false,
    },
    available: {
      type: DataTypes.BOOLEAN,
      allowNull: false,
    },
  },
  {
    sequelize,
    modelName: 'Room',
    tableName: 'Rooms'
  }
);

Reservation.init(
  {
    id: {
      type: DataTypes.INTEGER.UNSIGNED,
      autoIncrement: true,  
      primaryKey: true,     
    },
    check_in_date: {
      type: DataTypes.DATE,
      allowNull: false,
    },
    check_out_date: {
      type: DataTypes.DATE,
      allowNull: false,
    },
    total_cost: {
      type: DataTypes.FLOAT,
      allowNull: false,
    },
    guest_id: {
      type: DataTypes.INTEGER.UNSIGNED,
      references: {
        model: Guest,
        key: 'id',
      },
    },
    room_id: {
      type: DataTypes.INTEGER.UNSIGNED,
      references: {
        model: Room,
        key: 'id',
      },
    },
  },
  {
    sequelize,
    modelName: 'Reservation',
    tableName: 'Reservations'
  }
);


Guest.hasMany(Reservation, { foreignKey: 'guest_id' });
Reservation.belongsTo(Guest, { foreignKey: 'guest_id' });

Room.hasMany(Reservation, { foreignKey: 'room_id' });
Reservation.belongsTo(Room, { foreignKey: 'room_id' });

export { sequelize, Guest, Reservation, Room };

