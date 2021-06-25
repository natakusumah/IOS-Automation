@FlightLoginCompleteBooking
Feature: Flight Login Complete Booking

    @FlightLoginPaymentAlfamart
    Scenario:  Login User Booking Flight use payment Alfamart
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight round trip
        And I search flight
        And I "don't" change date my flight
        And I "don't" worry free fare
        And I choose airline for round trip
        And I fill my passenger data for flight
        And I "don't" additional baggage
        And I "use" using insurance for my flight
        And I confirm my data flight
        And I choose payment Alfamart
        Then I check instruction payment minimarket and direct to my order page

    @FlightLoginPaymentIndomaret
    Scenario:  Login User Booking Flight use payment Indomaret
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight single trip
        And I search flight
        And I "use" change date my flight
        And I "use" worry free fare
        And I choose airline for single trip
        And I fill my passenger data for flight
        And I "use" additional baggage
        And I "don't" using insurance for my flight
        And I confirm my data flight
        And I choose payment Indomaret
        Then I check instruction payment minimarket and direct to my order page

    @FlightLoginPaymentTransferBCA
    Scenario:  Login User Booking Flight use payment transfer bank BCA
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight single trip
        And I search flight
        And I "use" change date my flight
        And I "use" worry free fare
        And I choose airline for single trip
        And I fill my passenger data for flight
        And I "use" additional baggage
        And I "use" using insurance for my flight
        And I confirm my data flight
        And I choose payment transfer bank BCA
        Then I check instruction payment transfer bank and direct to my order page

    @FlightLoginPaymentTransferMandiri
    Scenario:  Login User Booking Flight use payment transfer bank mandiri
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight round trip
        And I search flight
        And I "don't" change date my flight
        And I "don't" worry free fare
        And I choose airline for round trip
        And I fill my passenger data for flight
        And I "don't" additional baggage
        And I "don't" using insurance for my flight
        And I confirm my data flight
        And I choose payment transfer bank Mandiri
        Then I check instruction payment transfer bank and direct to my order page


    @FlightLoginPaymentVirtualAccountMandiri
    Scenario: Login User Booking Flight use payment Virtual Account Mandiri
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight single trip
        And I search flight
        And I "don't" change date my flight
        And I "use" worry free fare
        And I choose airline for single trip
        And I fill my passenger data for flight
        And I "use" additional baggage
        And I "don't" using insurance for my flight
        And I confirm my data flight
        And I choose payment virtual account mandiri
        Then I check instruction payment virtual account and direct to my order page

    @FlightLoginPaymentVirtualAccountBCA
    Scenario:  Login User Booking Flight use payment Virtual Account BCA
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight round trip
        And I search flight
        And I "use" change date my flight
        And I "don't" worry free fare
        And I choose airline for round trip
        And I fill my passenger data for flight
        And I "don't" additional baggage
        And I "use" using insurance for my flight
        And I confirm my data flight
        And I choose payment virtual account BCA
        Then I check instruction payment virtual account and direct to my order page

    @FlightLoginPaymentVirtualAccountBNI
    Scenario:  Login User Booking Flight use payment Virtual Account BNI
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight single trip
        And I search flight
        And I "don't" change date my flight
        And I "use" worry free fare
        And I choose airline for single trip
        And I fill my passenger data for flight
        And I "use" additional baggage
        And I "use" using insurance for my flight
        And I confirm my data flight
        And I choose payment virtual account BNI
        Then I check instruction payment virtual account and direct to my order page

    @FlightLoginPaymentVirtualAccountBRIVA
    Scenario:  Login User Booking Flight use payment Virtual Account BRIVA
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight single trip
        And I search flight
        And I "use" change date my flight
        And I "don't" worry free fare
        And I choose airline for single trip
        And I fill my passenger data for flight
        And I "don't" additional baggage
        And I "use" using insurance for my flight
        And I confirm my data flight
        And I choose payment virtual account BRIVA
        Then I check instruction payment virtual account and direct to my order page

    @FlightLoginPaymentATM
    Scenario:  Login User Booking Flight use payment ATM
        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
        When I want to booking Flight product
        And I choose flight single trip
        And I search flight
        And I "use" change date my flight
        And I "use" worry free fare
        And I choose airline for single trip
        And I fill my passenger data for flight
        And I "use" additional baggage
        And I "don't" using insurance for my flight
        And I confirm my data flight
        And I choose payment ATM
        Then I check instruction payment atm and direct to my order page


#    @FlightLoginPaymentTIXPoint
#    Scenario:  Login User Booking Flight use payment TIXPoint
#        Given I login to application using email "Testios@tiket.com" and password "Testingios123!"
#        When I want to booking Flight product
#        And I choose flight single trip
#        And I search flight
#        And I "use" change date my flight
#        And I "don't" worry free fare
#        And I choose airline for single trip
#        And I fill my passenger data for flight
#        And I "use" additional baggage
#        And I "don't" using insurance for my flight
#        And I confirm my data flight
#        And I choose payment TIXPoint
#        Then I check instruction payment transfer bank and direct to my order page

    #@FlightLoginPaymentCreditCard

