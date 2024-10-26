public enum Gezegen {
    MERKÜR(1, 50.1, 1.1, 10),
    VENÜS(2, 100.1, 2.1, 20),
    DÜNYA(3, 150.1, 3.1, 30),
    MARS(4, 200.1, 4.1, 40),
    JÜPİTER(5, 250.1, 5.1, 50),
    SATÜRN(6, 300.1, 6.1, 60),
    URANÜS(7, 350.1, 7.1, 70),
    NEPTÜN(8, 400.1, 8.1, 80);

    private final int siralamaNumarasi;
    private final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;

    Gezegen(int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiralamaNumarasi() {
        return siralamaNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    @Override
    public String toString() {
        return String.format("%s: SıralamaNumarası: %d, Uzaklık: %f , Yaricap: %f km, DonmeSuresi: %f ",
                name(), siralamaNumarasi, uzaklik, yaricap, donmeSuresi);
    }
}
