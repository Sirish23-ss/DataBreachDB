package com.breachdatabase.webapp.Datbase_Taxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

import org.json.JSONArray;

public class Breach {
	private String Name;
	private String Title;
	private String Domain;
	private String BreachDate;
	private String AddedDate;
	private String modifiedDateString;
	private long PwnCount;
	private String Description;
	private String LogoPath;
	private JSONArray DataClasseStrings; 
	private boolean IsVerified;
	private boolean IsFabricated;
	private boolean IsSensitive;
	private boolean IsRetired;
	private boolean IsSpamList;
	private boolean IsMalware;
	public Breach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Breach(String name, String title, String domain, String breachDate, String addedDate,
			String modifiedDateString, long pwnCount, String description, String logoPath, JSONArray dataClasseStrings,
			boolean isVerified, boolean isFabricated, boolean isSensitive, boolean isRetired, boolean isSpamList,
			boolean isMalware) {
		super();
		Name = name;
		Title = title;
		Domain = domain;
		BreachDate = breachDate;
		AddedDate = addedDate;
		this.modifiedDateString = modifiedDateString;
		PwnCount = pwnCount;
		Description = description;
		LogoPath = logoPath;
		DataClasseStrings = dataClasseStrings;
		IsVerified = isVerified;
		IsFabricated = isFabricated;
		IsSensitive = isSensitive;
		IsRetired = isRetired;
		IsSpamList = isSpamList;
		IsMalware = isMalware;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	public String getBreachDate() {
		return BreachDate;
	}
	public void setBreachDate(String breachDate) {
		BreachDate = breachDate;
	}
	public String getAddedDate() {
		return AddedDate;
	}
	public void setAddedDate(String addedDate) {
		AddedDate = addedDate;
	}
	public String getModifiedDateString() {
		return modifiedDateString;
	}
	public void setModifiedDateString(String modifiedDateString) {
		this.modifiedDateString = modifiedDateString;
	}
	public long getPwnCount() {
		return PwnCount;
	}
	public void setPwnCount(long pwnCount) {
		PwnCount = pwnCount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLogoPath() {
		return LogoPath;
	}
	public void setLogoPath(String logoPath) {
		LogoPath = logoPath;
	}
	public JSONArray getDataClasseStrings() {
		return DataClasseStrings;
	}
	public void setDataClasseStrings(JSONArray dataClasseStrings) {
		DataClasseStrings = dataClasseStrings;
	}
	public boolean isIsVerified() {
		return IsVerified;
	}
	public void setIsVerified(boolean isVerified) {
		IsVerified = isVerified;
	}
	public boolean isIsFabricated() {
		return IsFabricated;
	}
	public void setIsFabricated(boolean isFabricated) {
		IsFabricated = isFabricated;
	}
	public boolean isIsSensitive() {
		return IsSensitive;
	}
	public void setIsSensitive(boolean isSensitive) {
		IsSensitive = isSensitive;
	}
	public boolean isIsRetired() {
		return IsRetired;
	}
	public void setIsRetired(boolean isRetired) {
		IsRetired = isRetired;
	}
	public boolean isIsSpamList() {
		return IsSpamList;
	}
	public void setIsSpamList(boolean isSpamList) {
		IsSpamList = isSpamList;
	}
	public boolean isIsMalware() {
		return IsMalware;
	}
	public void setIsMalware(boolean isMalware) {
		IsMalware = isMalware;
	}
	@Override
	public String toString() {
		return "Breach [Name=" + Name + ", Title=" + Title + ", Domain=" + Domain + ", BreachDate=" + BreachDate
				+ ", AddedDate=" + AddedDate + ", modifiedDateString=" + modifiedDateString + ", PwnCount=" + PwnCount
				+ ", Description=" + Description + ", LogoPath=" + LogoPath + ", DataClasseStrings=" + DataClasseStrings
				+ ", IsVerified=" + IsVerified + ", IsFabricated=" + IsFabricated + ", IsSensitive=" + IsSensitive
				+ ", IsRetired=" + IsRetired + ", IsSpamList=" + IsSpamList + ", IsMalware=" + IsMalware + "]";
	}
	
	
	
	
	

	
}