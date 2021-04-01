package com.example.tugasrecycleview;

public class Mahasiswa {
    private String Name;
    private String nohp;
    private String nim;
    private String email;


    public Mahasiswa(String Name, String nim, String nohp, String email){

        this.email = email;
        this.Name = Name;
        this.nim = nim;
        this.nohp = nohp;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
