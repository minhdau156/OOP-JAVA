package Adapter;

public class Customized_BSM {
    public BSM bsm = new BSM();
    public double calcT(Object startDate, Object endDate) {
        return 1.0;
    }
    public double calc_premium(double spot, double strike, Object startDate, Object endDate, double r, double sigma) {
        double T = this.calcT(startDate, endDate);
        return bsm.calc_premium(spot, strike, T, r, sigma);
    }
}
