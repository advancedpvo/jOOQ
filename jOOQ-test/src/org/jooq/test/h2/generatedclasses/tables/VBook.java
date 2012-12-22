/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 128508086;

	/**
	 * The singleton instance of <code>PUBLIC.V_BOOK</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.h2.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The column <code>PUBLIC.V_BOOK.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.DETAILS_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.TITLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.PUBLISHED_IN</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.LANGUAGE_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.CONTENT_TEXT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB.length(2147483647), V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.CONTENT_PDF</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB.length(2147483647), V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.REC_VERSION</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> REC_VERSION = createField("REC_VERSION", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>PUBLIC.V_BOOK.REC_TIMESTAMP</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord, java.sql.Timestamp> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("V_BOOK", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}
}
