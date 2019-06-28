package com.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(generator = "guid")
    @GenericGenerator(name = "guid", strategy = "com.demo.util.UseExistingOrGenerateUUIDGenerator")
    private String guid;


    private String movieName;
    private String theaterName;
    private String duration;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isPremium;
    private String announcements;
    private String announcementsExpDate;
    private String iconRef;
    @Column(columnDefinition = "VARCHAR(30) default 'Movies'")
    private String iconId;
    @Column(columnDefinition = "VARCHAR(10) default 'miles'")
    private String units;

    @Column(length = 200)
    private String email;
    @Column(length = 100)
    private String profileEmail;
    @Column(columnDefinition = "int default 0")
    private int likes;

    private String url;

    @Column(length = 1000)
    private String description;

    private String phoneNumber;

    @Column(length = 800)
    private String features;

    private String street;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String state;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements;
    }

    public String getAnnouncementsExpDate() {
        return announcementsExpDate;
    }

    public void setAnnouncementsExpDate(String announcementsExpDate) {
        this.announcementsExpDate = announcementsExpDate;
    }

    public String getIconRef() {
        return iconRef;
    }

    public void setIconRef(String iconRef) {
        this.iconRef = iconRef;
    }

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileEmail() {
        return profileEmail;
    }

    public void setProfileEmail(String profileEmail) {
        this.profileEmail = profileEmail;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(double countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getPhotoReferences() {
        return photoReferences;
    }

    public void setPhotoReferences(String photoReferences) {
        this.photoReferences = photoReferences;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getStDate() {
        return stDate;
    }

    public void setStDate(String stDate) {
        this.stDate = stDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    public LocalDateTime getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(LocalDateTime updatedTs) {
        this.updatedTs = updatedTs;
    }

    @Column(length = 50)

    private String zipCode;
    @Column(columnDefinition = "double default 0")
    private double lat = 0;
    @Column(columnDefinition = "double default 0")
    private double lon = 0;
    @Column(columnDefinition = "double default 1")
    private double countryCode;
    @Column(columnDefinition = "VARCHAR(50) default 'US'")
    private String country;
    @Column(length = 500)
    private String location;


    private String music;
    private String type;



    @Column(length = 800)
    private String timings;

    @Column(length = 600)
    private String photoReferences;

    private String bucketName;

    private String stDate;
    private String endDate;

    @Column(nullable = false, columnDefinition = "TINYINT default true")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isApproved;

    @Column(name = "createdts", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdts;

    @Column(name = "updatedTs", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime updatedTs;


}
