@CarLoginCompleteBooking
Feature: Car Login Complete Booking

  @CarLoginPaymentAlfamart
  Scenario:  Login User Booking Car use payment Alfamart
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking car product
    And I choose Location "Surabaya"
    And I search car
    And I select car
    And I fill pick up detail location "Booking test"
    And I confirm my data car
    And I choose payment Alfamart
    Then I check instruction payment minimarket and direct to my order page

  @CarLoginPaymentIndomaret
  Scenario:  Login User Booking Car use payment Indomaret
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking car product
    And I choose Location "Medan"
    And I search car
    And I select car
    And I fill pick up detail location "Booking test"
    And I confirm my data car
    And I choose payment Indomaret
    Then I check instruction payment minimarket and direct to my order page


  @CarLoginPaymentVirtualAccountMandiri
  Scenario: Login User Booking Car use payment Virtual Account Mandiri
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking car product
    And I choose Location "Bandung"
    And I search car
    And I select car
    And I fill pick up detail location "Booking test"
    And I confirm my data car
    And I choose payment virtual account mandiri
    Then I check instruction payment virtual account and direct to my order page

  @CarLoginPaymentVirtualAccountBCA
  Scenario:  Login User Booking Car use payment Virtual Account BCA
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking car product
    And I choose Location "Jakarta"
    And I search car
    And I select car
    And I fill pick up detail location "Booking test"
    And I confirm my data car
    And I choose payment virtual account BCA
    Then I check instruction payment virtual account and direct to my order page

  @CarLoginPaymentVirtualAccountBNI
  Scenario:  Login User Booking Car use payment Virtual Account BNI
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking car product
    And I choose Location "Aceh"
    And I search car
    And I select car
    And I fill pick up detail location "Booking test"
    And I confirm my data car
    And I choose payment virtual account BNI
    Then I check instruction payment virtual account and direct to my order page

  @CarLoginPaymentVirtualAccountBRIVA
  Scenario:  Login User Booking Car use payment Virtual Account BRIVA
    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
    When I want to booking car product
    And I choose Location "Bali"
    And I search car
    And I select car
    And I fill pick up detail location "Booking test"
    And I confirm my data car
    And I choose payment virtual account BRIVA
    Then I check instruction payment virtual account and direct to my order page

#  @CarLoginPaymentATM
#  Scenario:  Login User Booking Car use payment ATM
#    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
#    When I want to booking car product
#    And I choose Location "Yogyakarta"
#    And I search car
#    And I select car
#    And I fill pick up detail location "Booking test"
#    And I confirm my data car
#    And I choose payment ATM
#    Then I check instruction payment atm and direct to my order page


#  @CarLoginPaymentTransferBCA
#  Scenario:  Login User Booking Car use payment transfer bank BCA
#    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
#    When I want to booking car product
#    And I choose Location "Solo"
#    And I search car
#    And I select car
#    And I fill pick up detail location "Booking test"
#    And I confirm my data car
#    And I choose payment transfer bank BCA
#    Then I check instruction payment transfer bank and direct to my order page
#
#  @CarLoginPaymentTransferMandiri
#  Scenario:  Login User Booking Car use payment transfer bank mandiri
#    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
#    When I want to booking car product
#    And I choose Location "Malang"
#    And I search car
#    And I select car
#    And I fill pick up detail location "Booking test"
#    And I confirm my data car
#    And I choose payment transfer bank Mandiri
#    Then I check instruction payment transfer bank and direct to my order page

#  @CarLoginPaymentTIXPoint
#  Scenario:  Login User Booking Car use payment TIXPoint
#    Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
#    When I want to booking car product
#    And I choose Location "Tangerang"
#    And I search car
#    And I select car
#    And I fill pick up detail location "Booking test"
#    And I confirm my data car
#    And I choose payment TIXPoint
#    Then I check instruction payment virtual account and direct to my order page

    #@CarLoginPaymentCreditCard

