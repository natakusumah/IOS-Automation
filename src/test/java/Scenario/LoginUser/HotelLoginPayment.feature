@HotelLoginCompleteBooking
Feature: Hotel Login Complete Booking

  @HotelLoginPaymentAlfamart
  Scenario:  Login User Booking Hotel use payment Alfamart
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Bangkok"
    And I search hotel
    And I select hotel
    And I select room
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment Alfamart
    Then I check instruction payment minimarket and direct to my order page

  @HotelLoginPaymentIndomaret
  Scenario:  Login User Booking Hotel use payment Indomaret
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Bandung"
    And I search hotel
    And I select hotel
    And I select room
    And I booking for another person
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment Indomaret
    Then I check instruction payment minimarket and direct to my order page

  @HotelLoginPaymentTransferBCA
  Scenario:  Login User Booking Hotel use payment transfer bank BCA
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Seoul"
    And I search hotel
    And I select hotel
    And I select room
    And I confirm my data hotel
    And I choose payment transfer bank BCA
    Then I check instruction payment transfer bank and direct to my order page

  @HotelLoginPaymentTransferMandiri
  Scenario:  Login User Booking Hotel use payment transfer bank mandiri
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Yogyakarta"
    And I search hotel
    And I select hotel
    And I select room
    And I booking for another person
    And I confirm my data hotel
    And I choose payment transfer bank Mandiri
    Then I check instruction payment transfer bank and direct to my order page


  @HotelLoginPaymentVirtualAccountMandiri
  Scenario: Login User Booking Hotel use payment Virtual Account Mandiri
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "JAKARTA"
    And I search hotel
    And I select hotel
    And I select room
    And I booking for another person
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment virtual account mandiri
    Then I check instruction payment virtual account and direct to my order page

  @HotelLoginPaymentVirtualAccountBCA
  Scenario:  Login User Booking Hotel use payment Virtual Account BCA
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Bandung"
    And I search hotel
    And I select hotel
    And I select room
    And I confirm my data hotel
    And I choose payment virtual account BCA
    Then I check instruction payment virtual account and direct to my order page

  @HotelLoginPaymentVirtualAccountBNI
  Scenario:  Login User Booking Hotel use payment Virtual Account BNI
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Surabaya"
    And I search hotel
    And I select hotel
    And I select room
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment virtual account BNI
    Then I check instruction payment virtual account and direct to my order page

  @HotelLoginPaymentVirtualAccountBRIVA
  Scenario:  Login User Booking Hotel use payment Virtual Account BRIVA
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Bali"
    And I search hotel
    And I select hotel
    And I select room
    And I confirm my data hotel
    And I choose payment virtual account BRIVA
    Then I check instruction payment virtual account and direct to my order page

  @HotelLoginPaymentATM
  Scenario:  Login User Booking Hotel use payment ATM
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking hotel product
    And I choose hotel location "Singapore"
    And I search hotel
    And I select hotel
    And I select room
    And I booking for another person
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment ATM
    Then I check instruction payment atm and direct to my order page


#  @HotelLoginPaymentTIXPoint
#  Scenario:  Login User Booking Hotel use payment TIXPoint
#    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
#    When I want to booking hotel product
#    And I choose hotel location "Bandung"
#    And I search hotel
#   
#    And I select hotel
#    And I select room
#    And I booking for another person
#    And I fill special request "additional blanket"
#    And I confirm my data hotel
#    And I choose payment TIXPoint
#    Then I check instruction payment virtual account and direct to my order page

    #@HotelLoginPaymentCreditHoteld

