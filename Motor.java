class Motor {
    final String merk;
    int tahun;

    public Motor(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }

    public void setTahun(int tahun) {
        if (tahun >= 0) {
            this.tahun = tahun;
        } else {
            System.out.println("Tahun tidak valid");
        }
    }

    public void periksakondisi() {
        System.out.println("Mengecek kondisi motor...");
        if (cekMesin() && cekoli()) {
            System.out.println("Kondisi motor baik.");
        } else {
            System.out.println("Ada masalah dengan motor.");
        }
    }

    public void periksakondisi(boolean printInfo) {
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
}