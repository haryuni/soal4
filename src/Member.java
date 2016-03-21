public class Member {

    private String nama;
    private String team;
    private int umur;
    private int nilaiPenampilan;
    private int nilaiSuara;
    private int nilaiAttitude;

    public void setNama(String n) {
        nama = n;
    }

    public void setTeam(String t) {
        team = t;
    }

    public void setUmur(int u) {
        umur = u;
    }

    public void setPenampilan(int p) {
        nilaiPenampilan = p;
    }

    public void setSuara(int s) {
        nilaiSuara = s;
    }

    public void setAttitude(int a) {
        nilaiAttitude = a;
    }

    public String getNama() {
        return nama;
    }

    public String getTeam() {
        return team;
    }

    public int getUmur() {
        return umur;
    }

    public int getPenampilan() {
        return nilaiPenampilan;
    }

    public int getSuara() {
        return nilaiSuara;
    }

    public int getAttitude() {
        return nilaiAttitude;
    }

    public double getNilai() {
        return (nilaiPenampilan + nilaiSuara + nilaiAttitude) / 3;
    }
}