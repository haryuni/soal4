import java.util.ArrayList;

public class Main {

    public static ArrayList<Member> member = new ArrayList<>();

    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        m1.setNama("Haryuni");
        m1.setTeam("Informatika");
        m1.setUmur(18);
        m1.setPenampilan(95);
        m1.setSuara(90);
        m1.setAttitude(90);

        m2.setNama("Amel");
        m2.setTeam("SI");
        m2.setUmur(17);
        m2.setPenampilan(85);
        m2.setSuara(85);
        m2.setAttitude(70);

        m3.setNama("Ninda");
        m3.setTeam("PTI");
        m3.setUmur(18);
        m3.setPenampilan(80);
        m3.setSuara(90);
        m3.setAttitude(85);

        member.add(m1);
        member.add(m2);
        member.add(m3);
        result();
    }

    public static void result() {
        System.out.println(" ============= Member Malang ============");
        for (int i = 0; i < member.size(); i++) {
            System.out.println("Nama\t\t: " + member.get(i).getNama());
            System.out.println("Team\t\t: " + member.get(i).getTeam());
            System.out.println("Umur\t\t: " + member.get(i).getUmur() + " tahun");
            System.out.println("Nilai Rata-rata\t: " + member.get(i).getNilai());
            System.out.println("=======================================");
        }
    }
}