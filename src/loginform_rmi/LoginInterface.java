/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform_rmi;

/**
 *
 * @author User
 */
import java.rmi.*;

public interface LoginInterface extends Remote
{
 public boolean getLogin(String user, String pass ) throws RemoteException;
    
}
