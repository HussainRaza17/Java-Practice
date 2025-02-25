class SalaryDetails {
  public static void main(String[] args) {
      if (args.length != 4) {
          System.out.println("Usage: java SalaryDetails <Employee Name> <Basic Salary> <HRA %> <DA %>");
          return;
      }

      String employeeName = args[0];
      double basicSalary = Double.parseDouble(args[1]);
      double hraPercentage = Double.parseDouble(args[2]);
      double daPercentage = Double.parseDouble(args[3]);

      if (basicSalary <= 0) {
          System.out.println("Error: Basic salary must be greater than 0.");
          return;
      }
      if (hraPercentage < 0 || hraPercentage > 100 || daPercentage < 0 || daPercentage > 100) {
          System.out.println("Error: HRA and DA percentages must be in the range 0-100.");
          return;
      }

      double hra = (hraPercentage / 100) * basicSalary;
      double da = (daPercentage / 100) * basicSalary;
      double grossSalary = basicSalary + hra + da;

      System.out.println("Employee Name: " + employeeName);
      System.out.println("Basic Salary: " + basicSalary);
      System.out.println("HRA: " + hra);
      System.out.println("DA: " + da);
      System.out.println("Gross Salary: " + grossSalary);
  }
}
