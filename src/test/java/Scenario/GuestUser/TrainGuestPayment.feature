@TrainGuestCompleteBooking
Feature: Train Guest Complete Booking

 @TrainGuestPaymentAlfamart
 Scenario:  Guest User Booking Train use payment Alfamart
  Given I guest user
  When I want to booking train product
  And I want to go from "Bandung" to "Semarang"
  And I choose train round trip
  And I search train
  And I choose train for round trip
  And I fill guest data train with email "tiketautomation@mailinator.com"
  And I fill my passenger data for train
  And I "use" using insurance for my train
  And I confirm my data train
  And I choose payment Alfamart
  Then I check instruction payment minimarket and direct to my order page

 @TrainGuestPaymentIndomaret
 Scenario:  Guest User Booking Train use payment Indomaret
  Given I guest user
  When I want to booking train product
  And I want to go from "Semarang" to "Surabaya"
  And I choose train single trip
  And I search train
  And I choose train for single trip
  And I fill guest data train with email "tiketautomation@mailinator.com"
  And I fill my passenger data for train
  And I "don't" using insurance for my train
  And I confirm my data train
  And I choose payment Indomaret
  Then I check instruction payment minimarket and direct to my order page
  
  @TrainGuestPaymentVirtualAccountMandiri
  Scenario: Guest User Booking Train use payment Virtual Account Mandiri
   Given I guest user
    When I want to booking train product
    And I want to go from "Jakarta" to "Bandung"
    And I choose train single trip
    And I search train
    And I choose train for single trip
    And I fill guest data train with email "tiketautomation@mailinator.com"
    And I fill my passenger data for train
    And I "don't" using insurance for my train
    And I confirm my data train
    And I choose payment virtual account mandiri
    Then I check instruction payment virtual account and direct to my order page

  @TrainGuestPaymentVirtualAccountBCA
  Scenario:  Guest User Booking Train use payment Virtual Account BCA
   Given I guest user
    When I want to booking train product
    And I want to go from "Bandung" to "Surabaya"
    And I choose train round trip
    And I search train
    And I choose train for round trip
    And I fill guest data train with email "tiketautomation@mailinator.com"
    And I fill my passenger data for train
    And I "use" using insurance for my train
    And I confirm my data train
    And I choose payment virtual account BCA
    Then I check instruction payment virtual account and direct to my order page

    @TrainGuestPaymentVirtualAccountBNI
  Scenario:  Guest User Booking Train use payment Virtual Account BNI
   Given I guest user
    When I want to booking train product
    And I want to go from "Jakarta" to "Semarang"
    And I choose train single trip
    And I search train
    And I choose train for single trip
    And I fill guest data train with email "tiketautomation@mailinator.com"
    And I fill my passenger data for train
    And I "use" using insurance for my train
    And I confirm my data train
    And I choose payment virtual account BNI
    Then I check instruction payment virtual account and direct to my order page

  @TrainGuestPaymentVirtualAccountBRIVA
  Scenario:  Guest User Booking Train use payment Virtual Account BRIVA
   Given I guest user
    When I want to booking train product
    And I want to go from "Jakarta" to "Semarang"
    And I choose train single trip
    And I search train
    And I choose train for single trip
    And I fill guest data train with email "tiketautomation@mailinator.com"
    And I fill my passenger data for train
    And I "use" using insurance for my train
    And I confirm my data train
    And I choose payment virtual account BRIVA
    Then I check instruction payment virtual account and direct to my order page

#  @TrainGuestPaymentATM
#  Scenario:  Guest User Booking Train use payment ATM
#   Given I guest user
#    When I want to booking train product
#    And I want to go from "Solo" to "Semarang"
#    And I choose train single trip
#    And I search train
#    And I choose train for single trip
#    And I fill my passenger data for train
#    And I "don't" using insurance for my train
#    And I confirm my data train
#    And I choose payment ATM
#    Then I check instruction payment atm and direct to my order page



#  @TrainGuestPaymentTransferBCA
#  Scenario:  Guest User Booking Train use payment transfer bank BCA
#   Given I guest user
#    When I want to booking train product
#    And I want to go from "Yogyakarta" to "Solo"
#    And I choose train single trip
#    And I search train
#    And I choose train for single trip
#    And I fill my passenger data for train
#    And I "use" using insurance for my train
#    And I confirm my data train
#    And I choose payment transfer bank BCA
#    Then I check instruction payment transfer bank and direct to my order page
#
#  @TrainGuestPaymentTransferMandiri
#  Scenario:  Guest User Booking Train use payment transfer bank mandiri
#   Given I guest user
#    When I want to booking train product
#    And I want to go from "Lahat" to "Kertapati"
#    And I choose train round trip
#    And I search train
#    And I choose train for round trip
#    And I fill my passenger data for train
#    And I "don't" using insurance for my train
#    And I confirm my data train
#    And I choose payment transfer bank Mandiri
#    Then I check instruction payment transfer bank and direct to my order page

#  @TrainGuestPaymentTIXPoint
#  Scenario:  Guest User Booking Train use payment TIXPoint
#   Given I guest user
#    When I want to booking train product
#    And I choose train single trip
#    And I search train
#    And I choose train for single trip
#    And I fill my passenger data for train
#    And I "don't" using insurance for my train
#    And I confirm my data train
#    And I choose payment TIXPoint
#    Then I check instruction payment virtual account and direct to my order page

    #@TrainGuestPaymentCreditCard

