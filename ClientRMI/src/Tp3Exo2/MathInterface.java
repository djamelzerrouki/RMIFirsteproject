package Tp3Exo2;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MathInterface extends Remote
{
// add
  public  double add (double d1, double d2) throws RemoteException;
// sub
  public  double sub (double d1, double d2) throws RemoteException;
// mul
  public  double Mul (double d1, double d2) throws RemoteException;
// div
  public  double Div (double d1, double d2) throws RemoteException;

} 