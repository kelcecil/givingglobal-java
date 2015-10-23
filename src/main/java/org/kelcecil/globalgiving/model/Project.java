package org.kelcecil.globalgiving.model;

import com.google.api.client.util.Key;

/**
 * Created by kelcecil on 10/21/15.
 */
public class Project {
    @Key
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Key
    private String activities;

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    @Key
    private String additionalDocumentation;

    @Key
    private String approvedDate;

    @Key
    private String contactAddress;

    @Key
    private String contactAddress2;

    @Key
    private String contactCity;

    @Key
    private String contactCountry;

    @Key
    private String contactEmail;

    @Key
    private String contactName;

    @Key
    private String contactPhone;

    @Key
    private String contactPostal;

    @Key
    private String contactState;

    @Key
    private String contactTitle;

    @Key
    private String contactUrl;

    @Key
    private String country;

    //TODO: Add Donation Options objects

    @Key
    private float funding;

    @Key
    private float goal;

    @Key
    private int id;

    @Key
    private int imageGallerySize;

    @Key
    private String imageLink;

    // TODO: Add Image object(s)

    @Key("iso3166CountyCode")
    private String countryCode;

    @Key
    private String longTermImpact;

    @Key
    private String need;

    @Key
    private int numberOfDonations;

    @Key
    private Organization organization;

    @Key
    private String progressReportLink;

    @Key
    private String projectLink;

    @Key
    private String region;

    @Key
    private float remaining;

    @Key
    private String status;

    @Key
    private String summary;

    @Key
    private String themeName;

    public String getAdditionalDocumentation() {
        return additionalDocumentation;
    }

    public void setAdditionalDocumentation(String additionalDocumentation) {
        this.additionalDocumentation = additionalDocumentation;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactAddress2() {
        return contactAddress2;
    }

    public void setContactAddress2(String contactAddress2) {
        this.contactAddress2 = contactAddress2;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactCountry() {
        return contactCountry;
    }

    public void setContactCountry(String contactCountry) {
        this.contactCountry = contactCountry;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactPostal() {
        return contactPostal;
    }

    public void setContactPostal(String contactPostal) {
        this.contactPostal = contactPostal;
    }

    public String getContactState() {
        return contactState;
    }

    public void setContactState(String contactState) {
        this.contactState = contactState;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getFunding() {
        return funding;
    }

    public void setFunding(float funding) {
        this.funding = funding;
    }

    public float getGoal() {
        return goal;
    }

    public void setGoal(float goal) {
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageGallerySize() {
        return imageGallerySize;
    }

    public void setImageGallerySize(int imageGallerySize) {
        this.imageGallerySize = imageGallerySize;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLongTermImpact() {
        return longTermImpact;
    }

    public void setLongTermImpact(String longTermImpact) {
        this.longTermImpact = longTermImpact;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public int getNumberOfDonations() {
        return numberOfDonations;
    }

    public void setNumberOfDonations(int numberOfDonations) {
        this.numberOfDonations = numberOfDonations;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getProgressReportLink() {
        return progressReportLink;
    }

    public void setProgressReportLink(String progressReportLink) {
        this.progressReportLink = progressReportLink;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getRemaining() {
        return remaining;
    }

    public void setRemaining(float remaining) {
        this.remaining = remaining;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    // TODO: Add videos object.
}

