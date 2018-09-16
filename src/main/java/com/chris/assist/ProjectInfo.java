package com.chris.assist;

//用于构建项目的相关信息
public class ProjectInfo {
    private String srcPackageName;//源代码的根包名
    private String ormPackageName;//ORM实体类的后缀名
    private String entityExtName;//实体类的后缀名
    private String sampleEntityName;//示例实体类名
    private String sampleEntityTag;//示例实体类标记
    private String sampleDaoExt;//示例数据访问层后缀
    private String sampleDaoPackagename;//示例数据访问层包名
    private String sampleServiceExt;//示例数据处理层后缀
    private String sampleServicePackagename;//示例数据shuli处理层包名
    private String sampleApiExt;//示例接口层后缀
    private String sampleApiPackagename;//示例接口层包名

    private ProjectInfo() {
    }

    public static ProjectInfo get() {
        return new ProjectInfo();
    }

    public String getSrcPackageName() {
        return srcPackageName;
    }

    public ProjectInfo setSrcPackageName(String srcPackageName) {
        this.srcPackageName = srcPackageName;
        return this;
    }

    public String getOrmPackageName() {
        return ormPackageName;
    }

    public ProjectInfo setOrmPackageName(String ormPackageName) {
        this.ormPackageName = ormPackageName;
        return this;
    }

    public String getEntityExtName() {
        return entityExtName;
    }

    public ProjectInfo setEntityExtName(String entityExtName) {
        this.entityExtName = entityExtName;
        return this;
    }

    public String getSampleEntityName() {
        return sampleEntityName;
    }

    public ProjectInfo setSampleEntityName(String sampleEntityName) {
        this.sampleEntityName = sampleEntityName;
        return this;
    }

    public String getSampleEntityTag() {
        return sampleEntityTag;
    }

    public ProjectInfo setSampleEntityTag(String sampleEntityTag) {
        this.sampleEntityTag = sampleEntityTag;
        return this;
    }

    public String getSampleDaoExt() {
        return sampleDaoExt;
    }

    public ProjectInfo setSampleDaoExt(String sampleDaoExt) {
        this.sampleDaoExt = sampleDaoExt;
        return this;
    }

    public String getSampleDaoPackagename() {
        return sampleDaoPackagename;
    }

    public ProjectInfo setSampleDaoPackagename(String sampleDaoPackagename) {
        this.sampleDaoPackagename = sampleDaoPackagename;
        return this;
    }

    public String getSampleServiceExt() {
        return sampleServiceExt;
    }

    public ProjectInfo setSampleServiceExt(String sampleServiceExt) {
        this.sampleServiceExt = sampleServiceExt;
        return this;
    }

    public String getSampleServicePackagename() {
        return sampleServicePackagename;
    }

    public ProjectInfo setSampleServicePackagename(String sampleServicePackagename) {
        this.sampleServicePackagename = sampleServicePackagename;
        return this;
    }

    public String getSampleApiExt() {
        return sampleApiExt;
    }

    public ProjectInfo setSampleApiExt(String sampleApiExt) {
        this.sampleApiExt = sampleApiExt;
        return this;
    }

    public String getSampleApiPackagename() {
        return sampleApiPackagename;
    }

    public ProjectInfo setSampleApiPackagename(String sampleApiPackagename) {
        this.sampleApiPackagename = sampleApiPackagename;
        return this;
    }
}
