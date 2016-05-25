package org.mdacc.rists.bdi.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FM_REPORT_ALT_REF_LK_TB database table.
 * 
 */
@Entity
@Table(name="FM_REPORT_ALT_REF_LK_TB")
@NamedQuery(name="FmReportAltRefLkTb.findAll", query="SELECT f FROM FmReportAltRefLkTb f")
public class FmReportAltRefLkTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROW_ID")
	private long rowId;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_TS")
	private Date deleteTs;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="\"INCLUDE\"")
	private String include;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS")
	private Date insertTs;

	@Column(name="REFERENCE_ID")
	private String referenceId;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	//bi-directional many-to-one association to FmReportAltTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ALT_ID")
	private FmReportAltTb fmReportAltTb;

	//bi-directional many-to-one association to FmReportAltTherapyTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ALT_THERAPY_ID")
	private FmReportAltTherapyTb fmReportAltTherapyTb;

	//bi-directional many-to-one association to FmReportTb
	@ManyToOne
	@JoinColumn(name="FM_REPORT_ID")
	private FmReportTb fmReportTb;

	public FmReportAltRefLkTb() {
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDeleteTs() {
		return this.deleteTs;
	}

	public void setDeleteTs(Date deleteTs) {
		this.deleteTs = deleteTs;
	}

	public BigDecimal getEtlProcId() {
		return this.etlProcId;
	}

	public void setEtlProcId(BigDecimal etlProcId) {
		this.etlProcId = etlProcId;
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public FmReportAltTb getFmReportAltTb() {
		return this.fmReportAltTb;
	}

	public void setFmReportAltTb(FmReportAltTb fmReportAltTb) {
		this.fmReportAltTb = fmReportAltTb;
	}

	public FmReportAltTherapyTb getFmReportAltTherapyTb() {
		return this.fmReportAltTherapyTb;
	}

	public void setFmReportAltTherapyTb(FmReportAltTherapyTb fmReportAltTherapyTb) {
		this.fmReportAltTherapyTb = fmReportAltTherapyTb;
	}

	public FmReportTb getFmReportTb() {
		return this.fmReportTb;
	}

	public void setFmReportTb(FmReportTb fmReportTb) {
		this.fmReportTb = fmReportTb;
	}

}