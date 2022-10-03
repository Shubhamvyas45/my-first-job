publicclass Hello {



  publicstatic void main(String[] args) {

    introws = 5;



    for (inti = 1; i <= rows; ++i) {

      for (intj = 1; j <= i; ++j) {

        System.out.print("* ");

      }

      System.out.println();

    }

  }

}
