import { Guest, Reservation, Room } from './models.js';

export const resolvers = {
    Query: {
        getGuest: async (_: any, { id }: { id: string }) => {
            return await Guest.findByPk(id);
        },
        getAllGuests: async () => {
            return await Guest.findAll();
        },
        getReservation: async (_: any, { id }: { id: string }) => {
            return await Reservation.findByPk(id, {
                include: [Guest, Room],
            });
        },
        getAllReservations: async () => {
            return await Reservation.findAll({ include: [Guest, Room] });
        },
        getRoom: async (_: any, { id }: { id: string }) => {
            return await Room.findByPk(id);
        },
        getAllRooms: async () => {
            return await Room.findAll();
        },
    },

    Mutation: {
        createGuest: async (_: any, { first_name, last_name, email, phone_number }: any) => {
            return Guest.create({ first_name, last_name, email, phone_number });
        },
        updateGuest: async (_: any, { id, first_name, last_name, email, phone_number }: any) => {
            const guest = await Guest.findByPk(id);
            if (!guest) throw new Error('Guest not found');
            return await guest.update({ first_name, last_name, email, phone_number });
        },
        deleteGuest: async (_: any, { id }: { id: string }) => {
            const guest = await Guest.findByPk(id);
            if (!guest) throw new Error('Guest not found');
            await guest.destroy();
            return guest;
        },

        createReservation: async (_: any, { check_in_date, check_out_date, total_cost, guest_id, room_id }: any) => {
            const reservation = await Reservation.create({ check_in_date, check_out_date, total_cost, guest_id, room_id });
            return reservation;
        },
        createRoom: async (_: any, { room_number, type, price_per_night, available }: any) => {

            const room = await Room.create({ room_number, type, price_per_night, available });
            return room;
        },
        deleteRoom: async (_: any, { id }: { id: string }) => {
            const room = await Room.findByPk(id);
            if (!room) throw new Error('Room not found');
            await room.destroy();
            return room;
        },
    },
};
