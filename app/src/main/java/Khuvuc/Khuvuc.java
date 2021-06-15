package Khuvuc;

import java.util.List;

import Hoa.Hoa;

public class Khuvuc {
    private String tenKhuvuc;
    private List<Hoa> hoas;

    public Khuvuc(String tenKhuvuc, List<Hoa> hoas) {
        this.tenKhuvuc = tenKhuvuc;
        this.hoas = hoas;
    }

    public String getTenKhuvuc() {
        return tenKhuvuc;
    }

    public void setTenKhuvuc(String tenKhuvuc) {
        this.tenKhuvuc = tenKhuvuc;
    }

    public List<Hoa> getHoas() {
        return hoas;
    }

    public void setHoas(List<Hoa> hoas) {
        this.hoas = hoas;
    }
}
