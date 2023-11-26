class Motor {
    private final String merk;
    private int tahun;

public Motor (String merk, int tahun){
    this.merk = merk;
    this.tahun = tahun;
}
public String getMerk(){
    return merk;
}

public int getTahun (){ 
    return tahun;
}

public void tampilkanInfo() { 
    System.out.println("Merk: " + merk); 
    System.out.println("Tahun: " + tahun);
}

public void setTahun (int tahun) { 
    if (tahun >= 0) {
        this.tahun = tahun;
    } else {
        System.out.println("Tahun tidak valid");
    }
}

public void periksakondisi () { 
    System.out.println("Mengecek kondisi motor..."); 
    if (cekMesin() && cekoli()) { 
        System.out.println("Kondisi motor baik."); 
    } else {
        System.out.println("Ada masalah dengan motor.");
    }
}

public void periksakondisi (boolean printInfo) {
    periksakondisi(); 
    if (printInfo) { 
        tampilkanInfo();
    }
}

private boolean cekMesin() {
    System.out.println("Memeriksa mesin...");
    return true;
}


private boolean cekoli() { 
    System.out.println("Memeriksa oli...");
    return true;
}

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


