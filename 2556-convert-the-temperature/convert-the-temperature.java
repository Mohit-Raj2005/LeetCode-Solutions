class Solution {
    public double[] convertTemperature(double celsius) {
      double[] ans = new double[2];  // creating a double array of ans of 2 length to store the kelvin and farenhite
    //   double kelvin = celsius + 273.15;  // calculating temperature in kelvin 
    //   double Farenhite = celsius * 1.80 + 32.00; // calculating ans in farenhite
    //   ans[0] = kelvin;  // adding kelvin at index 0
    //   ans[1] = Farenhite; // adding farenhite at index 1 

    // this can be an optimized approach to solve this in terms of memory 
    ans[0] = celsius + 273.15;
    ans[1] =  celsius * 1.80 + 32.00;
      return ans;
    }
}