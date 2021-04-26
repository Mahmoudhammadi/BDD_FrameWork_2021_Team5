Feature: users are able to inter their userName and password
  on the signIn option
 Scenario Outline: test(1)
   Given user is on the chase bank home page
   When user click on sign in
   And user enter "<userName>" and "<password>"

   Examples:
     | userName  | password |
     | mahmoud92 | 12343    |
     | abes92    | 75869    |
     | slima     | trgft    |
     | djilali   | 64573    |
     | kader     | trygfhd  |