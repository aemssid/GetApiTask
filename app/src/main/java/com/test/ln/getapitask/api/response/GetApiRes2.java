package com.test.ln.getapitask.api.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ln-300 on 8/2/17.
 */

public class GetApiRes2 {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {

        @SerializedName("parking_id")
        @Expose
        private String parkingId;
        @SerializedName("pre_payment_status")
        @Expose
        private Integer prePaymentStatus;
        @SerializedName("pre_payment_order_detail")
        @Expose
        private PrePaymentOrderDetail prePaymentOrderDetail;
        @SerializedName("post_payment_status")
        @Expose
        private Integer postPaymentStatus;
        @SerializedName("post_payment_order_detail")
        @Expose
        private PostPaymentOrderDetail postPaymentOrderDetail;
        @SerializedName("txn_id")
        @Expose
        private Integer txnId;
        @SerializedName("owner_id")
        @Expose
        private String ownerId;
        @SerializedName("available_spaces")
        @Expose
        private Integer availableSpaces;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("beacons")
        @Expose
        private List<Beacon> beacons = null;
        @SerializedName("Card_details")
        @Expose
        private List<CardDetail> cardDetails = null;
        @SerializedName("parkingTypeStatus")
        @Expose
        private String parkingTypeStatus;
        @SerializedName("hourlyParkingID")
        @Expose
        private String hourlyParkingID;
        @SerializedName("amountDetail")
        @Expose
        private List<Object> amountDetail = null;

        public String getParkingId() {
            return parkingId;
        }

        public void setParkingId(String parkingId) {
            this.parkingId = parkingId;
        }

        public Integer getPrePaymentStatus() {
            return prePaymentStatus;
        }

        public void setPrePaymentStatus(Integer prePaymentStatus) {
            this.prePaymentStatus = prePaymentStatus;
        }

        public PrePaymentOrderDetail getPrePaymentOrderDetail() {
            return prePaymentOrderDetail;
        }

        public void setPrePaymentOrderDetail(PrePaymentOrderDetail prePaymentOrderDetail) {
            this.prePaymentOrderDetail = prePaymentOrderDetail;
        }

        public Integer getPostPaymentStatus() {
            return postPaymentStatus;
        }

        public void setPostPaymentStatus(Integer postPaymentStatus) {
            this.postPaymentStatus = postPaymentStatus;
        }

        public PostPaymentOrderDetail getPostPaymentOrderDetail() {
            return postPaymentOrderDetail;
        }

        public void setPostPaymentOrderDetail(PostPaymentOrderDetail postPaymentOrderDetail) {
            this.postPaymentOrderDetail = postPaymentOrderDetail;
        }

        public Integer getTxnId() {
            return txnId;
        }

        public void setTxnId(Integer txnId) {
            this.txnId = txnId;
        }

        public String getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(String ownerId) {
            this.ownerId = ownerId;
        }

        public Integer getAvailableSpaces() {
            return availableSpaces;
        }

        public void setAvailableSpaces(Integer availableSpaces) {
            this.availableSpaces = availableSpaces;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Beacon> getBeacons() {
            return beacons;
        }

        public void setBeacons(List<Beacon> beacons) {
            this.beacons = beacons;
        }

        public List<CardDetail> getCardDetails() {
            return cardDetails;
        }

        public void setCardDetails(List<CardDetail> cardDetails) {
            this.cardDetails = cardDetails;
        }

        public String getParkingTypeStatus() {
            return parkingTypeStatus;
        }

        public void setParkingTypeStatus(String parkingTypeStatus) {
            this.parkingTypeStatus = parkingTypeStatus;
        }

        public String getHourlyParkingID() {
            return hourlyParkingID;
        }

        public void setHourlyParkingID(String hourlyParkingID) {
            this.hourlyParkingID = hourlyParkingID;
        }

        public List<Object> getAmountDetail() {
            return amountDetail;
        }

        public void setAmountDetail(List<Object> amountDetail) {
            this.amountDetail = amountDetail;
        }
    }
    public class PrePaymentOrderDetail {

        @SerializedName("beacons")
        @Expose
        private List<Object> beacons = null;
        @SerializedName("TxnID")
        @Expose
        private Integer txnID;

        public List<Object> getBeacons() {
            return beacons;
        }

        public void setBeacons(List<Object> beacons) {
            this.beacons = beacons;
        }

        public Integer getTxnID() {
            return txnID;
        }

        public void setTxnID(Integer txnID) {
            this.txnID = txnID;
        }

    }
    public class PostPaymentOrderDetail {

        @SerializedName("beacons")
        @Expose
        private List<Object> beacons = null;
        @SerializedName("TxnID")
        @Expose
        private Integer txnID;

        public List<Object> getBeacons() {
            return beacons;
        }

        public void setBeacons(List<Object> beacons) {
            this.beacons = beacons;
        }

        public Integer getTxnID() {
            return txnID;
        }

        public void setTxnID(Integer txnID) {
            this.txnID = txnID;
        }

    }
    public class CardDetail {

        @SerializedName("Card_ID")
        @Expose
        private String cardID;
        @SerializedName("Card_Type")
        @Expose
        private String cardType;
        @SerializedName("CARD_NO")
        @Expose
        private String cARDNO;
        @SerializedName("Card_Exp_Year")
        @Expose
        private String cardExpYear;
        @SerializedName("Card_Exp_Month")
        @Expose
        private String cardExpMonth;
        @SerializedName("Card_FirstName")
        @Expose
        private String cardFirstName;
        @SerializedName("Card_Street")
        @Expose
        private String cardStreet;
        @SerializedName("Card_State")
        @Expose
        private String cardState;
        @SerializedName("Card_City")
        @Expose
        private String cardCity;
        @SerializedName("Card_Zip")
        @Expose
        private String cardZip;
        @SerializedName("Stripe_UserId")
        @Expose
        private String stripeUserId;
        @SerializedName("Card_StripeCustID")
        @Expose
        private String cardStripeCustID;
        @SerializedName("Card_Default")
        @Expose
        private String cardDefault;

        public String getCardID() {
            return cardID;
        }

        public void setCardID(String cardID) {
            this.cardID = cardID;
        }

        public String getCardType() {
            return cardType;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public String getCARDNO() {
            return cARDNO;
        }

        public void setCARDNO(String cARDNO) {
            this.cARDNO = cARDNO;
        }

        public String getCardExpYear() {
            return cardExpYear;
        }

        public void setCardExpYear(String cardExpYear) {
            this.cardExpYear = cardExpYear;
        }

        public String getCardExpMonth() {
            return cardExpMonth;
        }

        public void setCardExpMonth(String cardExpMonth) {
            this.cardExpMonth = cardExpMonth;
        }

        public String getCardFirstName() {
            return cardFirstName;
        }

        public void setCardFirstName(String cardFirstName) {
            this.cardFirstName = cardFirstName;
        }

        public String getCardStreet() {
            return cardStreet;
        }

        public void setCardStreet(String cardStreet) {
            this.cardStreet = cardStreet;
        }

        public String getCardState() {
            return cardState;
        }

        public void setCardState(String cardState) {
            this.cardState = cardState;
        }

        public String getCardCity() {
            return cardCity;
        }

        public void setCardCity(String cardCity) {
            this.cardCity = cardCity;
        }

        public String getCardZip() {
            return cardZip;
        }

        public void setCardZip(String cardZip) {
            this.cardZip = cardZip;
        }

        public String getStripeUserId() {
            return stripeUserId;
        }

        public void setStripeUserId(String stripeUserId) {
            this.stripeUserId = stripeUserId;
        }

        public String getCardStripeCustID() {
            return cardStripeCustID;
        }

        public void setCardStripeCustID(String cardStripeCustID) {
            this.cardStripeCustID = cardStripeCustID;
        }

        public String getCardDefault() {
            return cardDefault;
        }

        public void setCardDefault(String cardDefault) {
            this.cardDefault = cardDefault;
        }

    }
    public class Beacon {

        @SerializedName("gate_id")
        @Expose
        private String gateId;
        @SerializedName("garage_id")
        @Expose
        private String garageId;
        @SerializedName("beacon_id")
        @Expose
        private String beaconId;
        @SerializedName("gatemode")
        @Expose
        private String gatemode;
        @SerializedName("gate_status")
        @Expose
        private String gateStatus;

        public String getGateId() {
            return gateId;
        }

        public void setGateId(String gateId) {
            this.gateId = gateId;
        }

        public String getGarageId() {
            return garageId;
        }

        public void setGarageId(String garageId) {
            this.garageId = garageId;
        }

        public String getBeaconId() {
            return beaconId;
        }

        public void setBeaconId(String beaconId) {
            this.beaconId = beaconId;
        }

        public String getGatemode() {
            return gatemode;
        }

        public void setGatemode(String gatemode) {
            this.gatemode = gatemode;
        }

        public String getGateStatus() {
            return gateStatus;
        }

        public void setGateStatus(String gateStatus) {
            this.gateStatus = gateStatus;
        }

    }

}