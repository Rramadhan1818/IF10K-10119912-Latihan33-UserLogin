/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan33.userlogin;

/**
 *
 * @author hp
 */
public class User {
    private String username = "RizkiAdam";    
    private String password = "terbaikselalu";
    private boolean statusAkun;
    
private boolean cekAkun(String parUserName,  String parPassword) {
    if ((parUserName.equals(username)) && (parPassword.equals(password))) {
        return statusAkun = true;
    }else {
        return statusAkun = false;
    }
}

private void hasilLogin(boolean status, String parUserName){
    status = statusAkun;
    if (status){
        System.out.print("\n*****HALO   " + parUserName.toUpperCase() + "*****\n");
        System.out.println("Selamat Datang di Aplikasi ini");
    }else{
        System.out.println("\nOoops, Username atau Password anda salah");
    }   
}

public void checkLogin(String parUsername, String parPassword){
    cekAkun(parUsername, parPassword);
    hasilLogin(statusAkun,parUsername);
}

}
