/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Android\\Library\\android-education-project\\SamplePlayerService1\\app\\src\\main\\aidl\\com\\example\\sampleplayerservice\\IPlayerStateChangeListener.aidl
 */
package com.example.sampleplayerservice;
public interface IPlayerStateChangeListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.sampleplayerservice.IPlayerStateChangeListener
{
private static final java.lang.String DESCRIPTOR = "com.example.sampleplayerservice.IPlayerStateChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.sampleplayerservice.IPlayerStateChangeListener interface,
 * generating a proxy if needed.
 */
public static com.example.sampleplayerservice.IPlayerStateChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.sampleplayerservice.IPlayerStateChangeListener))) {
return ((com.example.sampleplayerservice.IPlayerStateChangeListener)iin);
}
return new com.example.sampleplayerservice.IPlayerStateChangeListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onChangedState:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onChangedState(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.sampleplayerservice.IPlayerStateChangeListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onChangedState(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_onChangedState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onChangedState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onChangedState(int state) throws android.os.RemoteException;
}
