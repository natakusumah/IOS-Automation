@HotelGuestCompleteBooking
Feature: Hotel Guest Complete Booking

 @HotelGuestPaymentAlfamart
 Scenario:  Guest User Booking Hotel use payment Alfamart
  Given I guest user
  When I want to booking hotel product
  And I choose hotel location "Kuala Lumpur"
  And I search hotel
  And I select hotel
  And I select room
  And I fill my contact details hotel using email "tiketautomation@mailinator.com"
  And I fill special request "additional blanket"
  And I confirm my data hotel
  And I choose payment Alfamart
  Then I check instruction payment minimarket and direct to my order page

 @HotelGuestPaymentIndomaret
 Scenario:  Guest User Booking Hotel use payment Indomaret
  Given I guest user
  When I want to booking hotel product
  And I choose hotel location "Bandung"
  And I search hotel
  And I select hotel
  And I select room
  And I fill my contact details hotel using email "tiketautomation@mailinator.com"
  And I booking for another person
  And I fill special request "additional blanket"
  And I confirm my data hotel
  And I choose payment Indomaret
  Then I check instruction payment minimarket and direct to my order page

 @HotelGuestPaymentTransferBCA
 Scenario:  Guest User Booking Hotel use payment transfer bank BCA
  Given I guest user
  When I want to booking hotel product
  And I choose hotel location "Tokyo"
  And I search hotel
  And I select hotel
  And I select room
  And I fill my contact details hotel using email "tiketautomation@mailinator.com"
  And I confirm my data hotel
  And I choose payment transfer bank BCA
  Then I check instruction payment transfer bank and direct to my order page

 @HotelGuestPaymentTransferMandiri
 Scenario:  Guest User Booking Hotel use payment transfer bank mandiri
  Given I guest user
  When I want to booking hotel product
  And I choose hotel location "Malang"
  And I search hotel
  And I select hotel
  And I select room
  And I fill my contact details hotel using email "tiketautomation@mailinator.com"
  And I booking for another person
  And I confirm my data hotel
  And I choose payment transfer bank Mandiri
  Then I check instruction payment transfer bank and direct to my order page


 @HotelGuestPaymentVirtualAccountMandiri
  Scenario: Guest User Booking Hotel use payment Virtual Account Mandiri
   Given I guest user
    When I want to booking hotel product
    And I choose hotel location "JAKARTA"
    And I search hotel
    And I select hotel
    And I select room
    And I fill my contact details hotel using email "tiketautomation@mailinator.com"
    And I booking for another person
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment virtual account mandiri
    Then I check instruction payment virtual account and direct to my order page

  @HotelGuestPaymentVirtualAccountBCA
  Scenario:  Guest User Booking Hotel use payment Virtual Account BCA
   Given I guest user
    When I want to booking hotel product
    And I choose hotel location "Bandung"
    And I search hotel
    And I select hotel
    And I select room
    And I fill my contact details hotel using email "tiketautomation@mailinator.com"
    And I confirm my data hotel
    And I choose payment virtual account BCA
    Then I check instruction payment virtual account and direct to my order page

  @HotelGuestPaymentVirtualAccountBNI
  Scenario:  Guest User Booking Hotel use payment Virtual Account BNI
   Given I guest user
    When I want to booking hotel product
    And I choose hotel location "Surabaya"
    And I search hotel
    And I select hotel
    And I select room
    And I fill my contact details hotel using email "tiketautomation@mailinator.com"
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment virtual account BNI
    Then I check instruction payment virtual account and direct to my order page

  @HotelGuestPaymentVirtualAccountBRIVA
  Scenario:  Guest User Booking Hotel use payment Virtual Account BRIVA
   Given I guest user
    When I want to booking hotel product
    And I choose hotel location "Bali"
    And I search hotel
    And I select hotel
    And I select room
    And I fill my contact details hotel using email "tiketautomation@mailinator.com"
    And I confirm my data hotel
    And I choose payment virtual account BRIVA
    Then I check instruction payment virtual account and direct to my order page

  @HotelGuestPaymentATM
  Scenario:  Guest User Booking Hotel use payment ATM
   Given I guest user
    When I want to booking hotel product
    And I choose hotel location "Singapore"
    And I search hotel
    And I select hotel
    And I select room
    And I fill my contact details hotel using email "tiketautomation@mailinator.com"
    And I booking for another person
    And I fill special request "additional blanket"
    And I confirm my data hotel
    And I choose payment ATM
    Then I check instruction payment atm and direct to my order page


#  @HotelGuestPaymentTIXPoint
#  Scenario:  Guest User Booking Hotel use payment TIXPoint
#   Given I guest user
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

    #@HotelGuestPaymentCreditHoteld

