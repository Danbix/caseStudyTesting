package com.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: hotel.proto")
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final String SERVICE_NAME = "HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.GetGuestRequest,
      com.grpc.stubs.Guest> getGetGuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGuest",
      requestType = com.grpc.stubs.GetGuestRequest.class,
      responseType = com.grpc.stubs.Guest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.GetGuestRequest,
      com.grpc.stubs.Guest> getGetGuestMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.GetGuestRequest, com.grpc.stubs.Guest> getGetGuestMethod;
    if ((getGetGuestMethod = HotelServiceGrpc.getGetGuestMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetGuestMethod = HotelServiceGrpc.getGetGuestMethod) == null) {
          HotelServiceGrpc.getGetGuestMethod = getGetGuestMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.GetGuestRequest, com.grpc.stubs.Guest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "GetGuest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetGuestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Guest.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetGuest"))
                  .build();
          }
        }
     }
     return getGetGuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.Empty,
      com.grpc.stubs.GuestList> getGetAllGuestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllGuests",
      requestType = com.grpc.stubs.Empty.class,
      responseType = com.grpc.stubs.GuestList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.Empty,
      com.grpc.stubs.GuestList> getGetAllGuestsMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.Empty, com.grpc.stubs.GuestList> getGetAllGuestsMethod;
    if ((getGetAllGuestsMethod = HotelServiceGrpc.getGetAllGuestsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetAllGuestsMethod = HotelServiceGrpc.getGetAllGuestsMethod) == null) {
          HotelServiceGrpc.getGetAllGuestsMethod = getGetAllGuestsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.Empty, com.grpc.stubs.GuestList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "GetAllGuests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GuestList.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetAllGuests"))
                  .build();
          }
        }
     }
     return getGetAllGuestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.CreateGuestRequest,
      com.grpc.stubs.Guest> getCreateGuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGuest",
      requestType = com.grpc.stubs.CreateGuestRequest.class,
      responseType = com.grpc.stubs.Guest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.CreateGuestRequest,
      com.grpc.stubs.Guest> getCreateGuestMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.CreateGuestRequest, com.grpc.stubs.Guest> getCreateGuestMethod;
    if ((getCreateGuestMethod = HotelServiceGrpc.getCreateGuestMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getCreateGuestMethod = HotelServiceGrpc.getCreateGuestMethod) == null) {
          HotelServiceGrpc.getCreateGuestMethod = getCreateGuestMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.CreateGuestRequest, com.grpc.stubs.Guest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "CreateGuest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.CreateGuestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Guest.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("CreateGuest"))
                  .build();
          }
        }
     }
     return getCreateGuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.UpdateGuestRequest,
      com.grpc.stubs.Guest> getUpdateGuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGuest",
      requestType = com.grpc.stubs.UpdateGuestRequest.class,
      responseType = com.grpc.stubs.Guest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.UpdateGuestRequest,
      com.grpc.stubs.Guest> getUpdateGuestMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.UpdateGuestRequest, com.grpc.stubs.Guest> getUpdateGuestMethod;
    if ((getUpdateGuestMethod = HotelServiceGrpc.getUpdateGuestMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getUpdateGuestMethod = HotelServiceGrpc.getUpdateGuestMethod) == null) {
          HotelServiceGrpc.getUpdateGuestMethod = getUpdateGuestMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.UpdateGuestRequest, com.grpc.stubs.Guest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "UpdateGuest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.UpdateGuestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Guest.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("UpdateGuest"))
                  .build();
          }
        }
     }
     return getUpdateGuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.DeleteGuestRequest,
      com.grpc.stubs.Guest> getDeleteGuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGuest",
      requestType = com.grpc.stubs.DeleteGuestRequest.class,
      responseType = com.grpc.stubs.Guest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.DeleteGuestRequest,
      com.grpc.stubs.Guest> getDeleteGuestMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.DeleteGuestRequest, com.grpc.stubs.Guest> getDeleteGuestMethod;
    if ((getDeleteGuestMethod = HotelServiceGrpc.getDeleteGuestMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteGuestMethod = HotelServiceGrpc.getDeleteGuestMethod) == null) {
          HotelServiceGrpc.getDeleteGuestMethod = getDeleteGuestMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.DeleteGuestRequest, com.grpc.stubs.Guest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "DeleteGuest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.DeleteGuestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Guest.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("DeleteGuest"))
                  .build();
          }
        }
     }
     return getDeleteGuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.GetReservationRequest,
      com.grpc.stubs.Reservation> getGetReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservation",
      requestType = com.grpc.stubs.GetReservationRequest.class,
      responseType = com.grpc.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.GetReservationRequest,
      com.grpc.stubs.Reservation> getGetReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.GetReservationRequest, com.grpc.stubs.Reservation> getGetReservationMethod;
    if ((getGetReservationMethod = HotelServiceGrpc.getGetReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetReservationMethod = HotelServiceGrpc.getGetReservationMethod) == null) {
          HotelServiceGrpc.getGetReservationMethod = getGetReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.GetReservationRequest, com.grpc.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "GetReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetReservation"))
                  .build();
          }
        }
     }
     return getGetReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.Empty,
      com.grpc.stubs.ReservationList> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = com.grpc.stubs.Empty.class,
      responseType = com.grpc.stubs.ReservationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.Empty,
      com.grpc.stubs.ReservationList> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.Empty, com.grpc.stubs.ReservationList> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = HotelServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetAllReservationsMethod = HotelServiceGrpc.getGetAllReservationsMethod) == null) {
          HotelServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.Empty, com.grpc.stubs.ReservationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.ReservationList.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.CreateReservationRequest,
      com.grpc.stubs.Reservation> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = com.grpc.stubs.CreateReservationRequest.class,
      responseType = com.grpc.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.CreateReservationRequest,
      com.grpc.stubs.Reservation> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.CreateReservationRequest, com.grpc.stubs.Reservation> getCreateReservationMethod;
    if ((getCreateReservationMethod = HotelServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getCreateReservationMethod = HotelServiceGrpc.getCreateReservationMethod) == null) {
          HotelServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.CreateReservationRequest, com.grpc.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.UpdateReservationRequest,
      com.grpc.stubs.Reservation> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = com.grpc.stubs.UpdateReservationRequest.class,
      responseType = com.grpc.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.UpdateReservationRequest,
      com.grpc.stubs.Reservation> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.UpdateReservationRequest, com.grpc.stubs.Reservation> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = HotelServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getUpdateReservationMethod = HotelServiceGrpc.getUpdateReservationMethod) == null) {
          HotelServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.UpdateReservationRequest, com.grpc.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.DeleteReservationRequest,
      com.grpc.stubs.Reservation> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = com.grpc.stubs.DeleteReservationRequest.class,
      responseType = com.grpc.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.DeleteReservationRequest,
      com.grpc.stubs.Reservation> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.DeleteReservationRequest, com.grpc.stubs.Reservation> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = HotelServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteReservationMethod = HotelServiceGrpc.getDeleteReservationMethod) == null) {
          HotelServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.DeleteReservationRequest, com.grpc.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.GetRoomRequest,
      com.grpc.stubs.Room> getGetRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoom",
      requestType = com.grpc.stubs.GetRoomRequest.class,
      responseType = com.grpc.stubs.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.GetRoomRequest,
      com.grpc.stubs.Room> getGetRoomMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.GetRoomRequest, com.grpc.stubs.Room> getGetRoomMethod;
    if ((getGetRoomMethod = HotelServiceGrpc.getGetRoomMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetRoomMethod = HotelServiceGrpc.getGetRoomMethod) == null) {
          HotelServiceGrpc.getGetRoomMethod = getGetRoomMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.GetRoomRequest, com.grpc.stubs.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "GetRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Room.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetRoom"))
                  .build();
          }
        }
     }
     return getGetRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.Empty,
      com.grpc.stubs.RoomList> getGetAllRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRooms",
      requestType = com.grpc.stubs.Empty.class,
      responseType = com.grpc.stubs.RoomList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.Empty,
      com.grpc.stubs.RoomList> getGetAllRoomsMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.Empty, com.grpc.stubs.RoomList> getGetAllRoomsMethod;
    if ((getGetAllRoomsMethod = HotelServiceGrpc.getGetAllRoomsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetAllRoomsMethod = HotelServiceGrpc.getGetAllRoomsMethod) == null) {
          HotelServiceGrpc.getGetAllRoomsMethod = getGetAllRoomsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.Empty, com.grpc.stubs.RoomList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "GetAllRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.RoomList.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetAllRooms"))
                  .build();
          }
        }
     }
     return getGetAllRoomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.CreateRoomRequest,
      com.grpc.stubs.Room> getCreateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoom",
      requestType = com.grpc.stubs.CreateRoomRequest.class,
      responseType = com.grpc.stubs.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.CreateRoomRequest,
      com.grpc.stubs.Room> getCreateRoomMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.CreateRoomRequest, com.grpc.stubs.Room> getCreateRoomMethod;
    if ((getCreateRoomMethod = HotelServiceGrpc.getCreateRoomMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getCreateRoomMethod = HotelServiceGrpc.getCreateRoomMethod) == null) {
          HotelServiceGrpc.getCreateRoomMethod = getCreateRoomMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.CreateRoomRequest, com.grpc.stubs.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "CreateRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.CreateRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Room.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("CreateRoom"))
                  .build();
          }
        }
     }
     return getCreateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.UpdateRoomRequest,
      com.grpc.stubs.Room> getUpdateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoom",
      requestType = com.grpc.stubs.UpdateRoomRequest.class,
      responseType = com.grpc.stubs.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.UpdateRoomRequest,
      com.grpc.stubs.Room> getUpdateRoomMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.UpdateRoomRequest, com.grpc.stubs.Room> getUpdateRoomMethod;
    if ((getUpdateRoomMethod = HotelServiceGrpc.getUpdateRoomMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getUpdateRoomMethod = HotelServiceGrpc.getUpdateRoomMethod) == null) {
          HotelServiceGrpc.getUpdateRoomMethod = getUpdateRoomMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.UpdateRoomRequest, com.grpc.stubs.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "UpdateRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.UpdateRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Room.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("UpdateRoom"))
                  .build();
          }
        }
     }
     return getUpdateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.DeleteRoomRequest,
      com.grpc.stubs.Room> getDeleteRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoom",
      requestType = com.grpc.stubs.DeleteRoomRequest.class,
      responseType = com.grpc.stubs.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.DeleteRoomRequest,
      com.grpc.stubs.Room> getDeleteRoomMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.DeleteRoomRequest, com.grpc.stubs.Room> getDeleteRoomMethod;
    if ((getDeleteRoomMethod = HotelServiceGrpc.getDeleteRoomMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteRoomMethod = HotelServiceGrpc.getDeleteRoomMethod) == null) {
          HotelServiceGrpc.getDeleteRoomMethod = getDeleteRoomMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.DeleteRoomRequest, com.grpc.stubs.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "DeleteRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.DeleteRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.Room.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("DeleteRoom"))
                  .build();
          }
        }
     }
     return getDeleteRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    return new HotelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HotelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Guest Services
     * </pre>
     */
    public void getGuest(com.grpc.stubs.GetGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGuestMethod(), responseObserver);
    }

    /**
     */
    public void getAllGuests(com.grpc.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.GuestList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllGuestsMethod(), responseObserver);
    }

    /**
     */
    public void createGuest(com.grpc.stubs.CreateGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGuestMethod(), responseObserver);
    }

    /**
     */
    public void updateGuest(com.grpc.stubs.UpdateGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGuestMethod(), responseObserver);
    }

    /**
     */
    public void deleteGuest(com.grpc.stubs.DeleteGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGuestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reservation Services
     * </pre>
     */
    public void getReservation(com.grpc.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationMethod(), responseObserver);
    }

    /**
     */
    public void getAllReservations(com.grpc.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.ReservationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     */
    public void createReservation(com.grpc.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(com.grpc.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(com.grpc.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Room Services
     * </pre>
     */
    public void getRoom(com.grpc.stubs.GetRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoomMethod(), responseObserver);
    }

    /**
     */
    public void getAllRooms(com.grpc.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.RoomList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRoomsMethod(), responseObserver);
    }

    /**
     */
    public void createRoom(com.grpc.stubs.CreateRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRoomMethod(), responseObserver);
    }

    /**
     */
    public void updateRoom(com.grpc.stubs.UpdateRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRoomMethod(), responseObserver);
    }

    /**
     */
    public void deleteRoom(com.grpc.stubs.DeleteRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGuestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.GetGuestRequest,
                com.grpc.stubs.Guest>(
                  this, METHODID_GET_GUEST)))
          .addMethod(
            getGetAllGuestsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.Empty,
                com.grpc.stubs.GuestList>(
                  this, METHODID_GET_ALL_GUESTS)))
          .addMethod(
            getCreateGuestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.CreateGuestRequest,
                com.grpc.stubs.Guest>(
                  this, METHODID_CREATE_GUEST)))
          .addMethod(
            getUpdateGuestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.UpdateGuestRequest,
                com.grpc.stubs.Guest>(
                  this, METHODID_UPDATE_GUEST)))
          .addMethod(
            getDeleteGuestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.DeleteGuestRequest,
                com.grpc.stubs.Guest>(
                  this, METHODID_DELETE_GUEST)))
          .addMethod(
            getGetReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.GetReservationRequest,
                com.grpc.stubs.Reservation>(
                  this, METHODID_GET_RESERVATION)))
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.Empty,
                com.grpc.stubs.ReservationList>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.CreateReservationRequest,
                com.grpc.stubs.Reservation>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.UpdateReservationRequest,
                com.grpc.stubs.Reservation>(
                  this, METHODID_UPDATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.DeleteReservationRequest,
                com.grpc.stubs.Reservation>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            getGetRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.GetRoomRequest,
                com.grpc.stubs.Room>(
                  this, METHODID_GET_ROOM)))
          .addMethod(
            getGetAllRoomsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.Empty,
                com.grpc.stubs.RoomList>(
                  this, METHODID_GET_ALL_ROOMS)))
          .addMethod(
            getCreateRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.CreateRoomRequest,
                com.grpc.stubs.Room>(
                  this, METHODID_CREATE_ROOM)))
          .addMethod(
            getUpdateRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.UpdateRoomRequest,
                com.grpc.stubs.Room>(
                  this, METHODID_UPDATE_ROOM)))
          .addMethod(
            getDeleteRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.DeleteRoomRequest,
                com.grpc.stubs.Room>(
                  this, METHODID_DELETE_ROOM)))
          .build();
    }
  }

  /**
   */
  public static final class HotelServiceStub extends io.grpc.stub.AbstractStub<HotelServiceStub> {
    private HotelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Guest Services
     * </pre>
     */
    public void getGuest(com.grpc.stubs.GetGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGuestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllGuests(com.grpc.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.GuestList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllGuestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGuest(com.grpc.stubs.CreateGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGuestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGuest(com.grpc.stubs.UpdateGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGuestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGuest(com.grpc.stubs.DeleteGuestRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Guest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGuestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reservation Services
     * </pre>
     */
    public void getReservation(com.grpc.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservations(com.grpc.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.ReservationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReservation(com.grpc.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(com.grpc.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.grpc.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Room Services
     * </pre>
     */
    public void getRoom(com.grpc.stubs.GetRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRooms(com.grpc.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.RoomList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRoomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRoom(com.grpc.stubs.CreateRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoom(com.grpc.stubs.UpdateRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRoom(com.grpc.stubs.DeleteRoomRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.Room> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelServiceBlockingStub extends io.grpc.stub.AbstractStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Guest Services
     * </pre>
     */
    public com.grpc.stubs.Guest getGuest(com.grpc.stubs.GetGuestRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGuestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.GuestList getAllGuests(com.grpc.stubs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllGuestsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Guest createGuest(com.grpc.stubs.CreateGuestRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGuestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Guest updateGuest(com.grpc.stubs.UpdateGuestRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGuestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Guest deleteGuest(com.grpc.stubs.DeleteGuestRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGuestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reservation Services
     * </pre>
     */
    public com.grpc.stubs.Reservation getReservation(com.grpc.stubs.GetReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.ReservationList getAllReservations(com.grpc.stubs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Reservation createReservation(com.grpc.stubs.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Reservation updateReservation(com.grpc.stubs.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Reservation deleteReservation(com.grpc.stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Room Services
     * </pre>
     */
    public com.grpc.stubs.Room getRoom(com.grpc.stubs.GetRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.RoomList getAllRooms(com.grpc.stubs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRoomsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Room createRoom(com.grpc.stubs.CreateRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Room updateRoom(com.grpc.stubs.UpdateRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.stubs.Room deleteRoom(com.grpc.stubs.DeleteRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelServiceFutureStub extends io.grpc.stub.AbstractStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Guest Services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Guest> getGuest(
        com.grpc.stubs.GetGuestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGuestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.GuestList> getAllGuests(
        com.grpc.stubs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllGuestsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Guest> createGuest(
        com.grpc.stubs.CreateGuestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGuestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Guest> updateGuest(
        com.grpc.stubs.UpdateGuestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGuestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Guest> deleteGuest(
        com.grpc.stubs.DeleteGuestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGuestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reservation Services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Reservation> getReservation(
        com.grpc.stubs.GetReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.ReservationList> getAllReservations(
        com.grpc.stubs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Reservation> createReservation(
        com.grpc.stubs.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Reservation> updateReservation(
        com.grpc.stubs.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Reservation> deleteReservation(
        com.grpc.stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Room Services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Room> getRoom(
        com.grpc.stubs.GetRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.RoomList> getAllRooms(
        com.grpc.stubs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRoomsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Room> createRoom(
        com.grpc.stubs.CreateRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Room> updateRoom(
        com.grpc.stubs.UpdateRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.Room> deleteRoom(
        com.grpc.stubs.DeleteRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GUEST = 0;
  private static final int METHODID_GET_ALL_GUESTS = 1;
  private static final int METHODID_CREATE_GUEST = 2;
  private static final int METHODID_UPDATE_GUEST = 3;
  private static final int METHODID_DELETE_GUEST = 4;
  private static final int METHODID_GET_RESERVATION = 5;
  private static final int METHODID_GET_ALL_RESERVATIONS = 6;
  private static final int METHODID_CREATE_RESERVATION = 7;
  private static final int METHODID_UPDATE_RESERVATION = 8;
  private static final int METHODID_DELETE_RESERVATION = 9;
  private static final int METHODID_GET_ROOM = 10;
  private static final int METHODID_GET_ALL_ROOMS = 11;
  private static final int METHODID_CREATE_ROOM = 12;
  private static final int METHODID_UPDATE_ROOM = 13;
  private static final int METHODID_DELETE_ROOM = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GUEST:
          serviceImpl.getGuest((com.grpc.stubs.GetGuestRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Guest>) responseObserver);
          break;
        case METHODID_GET_ALL_GUESTS:
          serviceImpl.getAllGuests((com.grpc.stubs.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.GuestList>) responseObserver);
          break;
        case METHODID_CREATE_GUEST:
          serviceImpl.createGuest((com.grpc.stubs.CreateGuestRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Guest>) responseObserver);
          break;
        case METHODID_UPDATE_GUEST:
          serviceImpl.updateGuest((com.grpc.stubs.UpdateGuestRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Guest>) responseObserver);
          break;
        case METHODID_DELETE_GUEST:
          serviceImpl.deleteGuest((com.grpc.stubs.DeleteGuestRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Guest>) responseObserver);
          break;
        case METHODID_GET_RESERVATION:
          serviceImpl.getReservation((com.grpc.stubs.GetReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((com.grpc.stubs.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.ReservationList>) responseObserver);
          break;
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((com.grpc.stubs.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((com.grpc.stubs.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.grpc.stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Reservation>) responseObserver);
          break;
        case METHODID_GET_ROOM:
          serviceImpl.getRoom((com.grpc.stubs.GetRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Room>) responseObserver);
          break;
        case METHODID_GET_ALL_ROOMS:
          serviceImpl.getAllRooms((com.grpc.stubs.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.RoomList>) responseObserver);
          break;
        case METHODID_CREATE_ROOM:
          serviceImpl.createRoom((com.grpc.stubs.CreateRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Room>) responseObserver);
          break;
        case METHODID_UPDATE_ROOM:
          serviceImpl.updateRoom((com.grpc.stubs.UpdateRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Room>) responseObserver);
          break;
        case METHODID_DELETE_ROOM:
          serviceImpl.deleteRoom((com.grpc.stubs.DeleteRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.Room>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.stubs.Hotel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getGetGuestMethod())
              .addMethod(getGetAllGuestsMethod())
              .addMethod(getCreateGuestMethod())
              .addMethod(getUpdateGuestMethod())
              .addMethod(getDeleteGuestMethod())
              .addMethod(getGetReservationMethod())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getCreateReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getGetRoomMethod())
              .addMethod(getGetAllRoomsMethod())
              .addMethod(getCreateRoomMethod())
              .addMethod(getUpdateRoomMethod())
              .addMethod(getDeleteRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
