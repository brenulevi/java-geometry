import java.time.LocalDate;
import java.util.Scanner;

public class Person {
  private String name;
  private String phone;
  private String born_date;
  private String cpf;
  private String email;

  protected int age;

  public Person() {
    // Instatiate Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    this.setName(sc.nextLine());

    System.out.println("Digite seu cpf: ");
    this.setCpf(sc.nextLine());

    System.out.println("Digite seu email: ");
    this.setEmail(sc.nextLine());

    System.out.println("Digite seu número: ");
    this.setPhone(sc.nextLine());

    System.out.println("Digite sua data de nascimento: ");
    this.setBornDate(sc.nextLine());

    // Close Scanner
    sc.close();
  }

  public String getCpf() {
    String[] arr_cpf_str = {
        this.cpf.substring(0, 3),
        this.cpf.substring(3, 6),
        this.cpf.substring(6, 9),
        this.cpf.substring(9, 11)
    };

    return String.format("%s.%s.%s-%s", arr_cpf_str[0], arr_cpf_str[1], arr_cpf_str[2], arr_cpf_str[3]);
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    String[] arr_phone_str = {
        this.phone.substring(0, 2),
        this.phone.substring(2, 3),
        this.phone.substring(3, 7),
        this.phone.substring(7, 11)
    };

    return String.format("(%s) %s %s-%s", arr_phone_str[0], arr_phone_str[1], arr_phone_str[2], arr_phone_str[3]);
  }

  public String getBornDate() {
    return born_date;
  }

  private int getAge() {
    return this.age;
  }

  public String getEmail() {
    return this.email;
  }

  public void getPersonInfo() {
    System.out.print("\n");
    System.out.println("** ====== This is you ====== **");
    System.out.println("Name: " + this.getName());
    System.out.println("CPF: " + this.getCpf());
    System.out.println("Email: " + this.getEmail());
    System.out.println("Phone: " + this.getPhone());
    System.out.println("Age: " + this.getAge());
    System.out.println("** ========================= **");

    System.out.print("\n");
  }

  public void setCpf(String new_cpf) {
    this.cpf = new_cpf;
  }

  public void setName(String new_name) {
    this.name = new_name;
  }

  public void setEmail(String new_email) {
    this.email = new_email;
  }

  public void setPhone(String new_phone) {
    this.phone = new_phone;
  }

  public void setBornDate(String new_born_date) {
    this.born_date = new_born_date;
    this.setAge();

  }

  public void setAge() {
    String[] arr_born_date = this.born_date.split("/");
    String[] arr_actual_date = LocalDate.now().toString().split("-");

    this.age = Integer.parseInt(arr_actual_date[0]) - Integer.parseInt(arr_born_date[2]);
  }
}