class Motorsport extends Motor {
    private String tipe;

    public Motorsport (String merk, int tahun, String tipe) {
        super (merk, tahun);

        this.tipe = tipe;
    }

    public void tampilkanInfo () {
        System.out.println("ini adalah motor sport" + merk + "tipe" +tipe);
        System.out.println("tahun : " + tahun);
    }
}
class MotorMatic extends Motor {
    private boolean hematBahanBakar;

    public MotorMatic (String merk, int tahun, boolean hematBahanBakar) {
        super (merk, tahun);
        this.hematBahanBakar= hematBahanBakar;
    }
    public void tampilkanInfo() {
        String hemat = hematBahanBakar ? "hemat": "tidak hemat";
        System.out.println("Ini adalah motor matic " + merk + " yang " + hemat + "bakar bakar");
        System.out.println("Tahun: " + tahun);
    }
}
public class Main {
    public static void main(String[] args) {
        Motor motorl = new Motor("Yamaha", 2022);
        System.out.println("Merk motor komeng: " + motorl.getMerk());
        System.out.println("Tahun motor komeng: " + motorl.getTahun ());

        Motor motor2 = new Motor("Honda", 2000);
        motor2.setTahun(-1);

        motorl.periksakondisi (true);

        Motor sport = new Motorsport ("Kawasaki", 2020, "Ninja");
        Motor matic = new MotorMatic("Honda", 2019, true);

        Motor[] motors = {sport, matic};

        for (Motor motor : motors) {
            System.out.println("-----------");
            motor.tampilkanInfo();
        }
        System.out.println("-------------");
    }
}
