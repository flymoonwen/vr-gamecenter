package gamecenter.db.entity;

import javax.persistence.*;

/**
 * Created by MooN on 2016/11/24.
 */
@Entity
@Table(name = "armor", schema = "gameserver-db", catalog = "")
public class ArmorEntity {
    private int id;
    private String name;
    private String icon;
    private String descibe;
    private String bodypart;
    private String armorType;
    private byte useLevel;
    private Byte armorCon;
    private int curDur;
    private int maxDur;
    private Integer hp;
    private Integer mp;
    private Integer def;
    private Integer dodge;
    private Integer repel;
    private Double price;
    private Double shop;
    private String isEnchant;
    private String bindRule;
    private Integer suitId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "descibe")
    public String getDescibe() {
        return descibe;
    }

    public void setDescibe(String descibe) {
        this.descibe = descibe;
    }

    @Basic
    @Column(name = "bodypart")
    public String getBodypart() {
        return bodypart;
    }

    public void setBodypart(String bodypart) {
        this.bodypart = bodypart;
    }

    @Basic
    @Column(name = "armorType")
    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    @Basic
    @Column(name = "useLevel")
    public byte getUseLevel() {
        return useLevel;
    }

    public void setUseLevel(byte useLevel) {
        this.useLevel = useLevel;
    }

    @Basic
    @Column(name = "armorCon")
    public Byte getArmorCon() {
        return armorCon;
    }

    public void setArmorCon(Byte armorCon) {
        this.armorCon = armorCon;
    }

    @Basic
    @Column(name = "curDur")
    public int getCurDur() {
        return curDur;
    }

    public void setCurDur(int curDur) {
        this.curDur = curDur;
    }

    @Basic
    @Column(name = "maxDur")
    public int getMaxDur() {
        return maxDur;
    }

    public void setMaxDur(int maxDur) {
        this.maxDur = maxDur;
    }

    @Basic
    @Column(name = "hp")
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "mp")
    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    @Basic
    @Column(name = "def")
    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    @Basic
    @Column(name = "dodge")
    public Integer getDodge() {
        return dodge;
    }

    public void setDodge(Integer dodge) {
        this.dodge = dodge;
    }

    @Basic
    @Column(name = "repel")
    public Integer getRepel() {
        return repel;
    }

    public void setRepel(Integer repel) {
        this.repel = repel;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "shop")
    public Double getShop() {
        return shop;
    }

    public void setShop(Double shop) {
        this.shop = shop;
    }

    @Basic
    @Column(name = "isEnchant")
    public String getIsEnchant() {
        return isEnchant;
    }

    public void setIsEnchant(String isEnchant) {
        this.isEnchant = isEnchant;
    }

    @Basic
    @Column(name = "bindRule")
    public String getBindRule() {
        return bindRule;
    }

    public void setBindRule(String bindRule) {
        this.bindRule = bindRule;
    }

    @Basic
    @Column(name = "suitId")
    public Integer getSuitId() {
        return suitId;
    }

    public void setSuitId(Integer suitId) {
        this.suitId = suitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArmorEntity that = (ArmorEntity) o;

        if (id != that.id) return false;
        if (useLevel != that.useLevel) return false;
        if (curDur != that.curDur) return false;
        if (maxDur != that.maxDur) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (descibe != null ? !descibe.equals(that.descibe) : that.descibe != null) return false;
        if (bodypart != null ? !bodypart.equals(that.bodypart) : that.bodypart != null) return false;
        if (armorType != null ? !armorType.equals(that.armorType) : that.armorType != null) return false;
        if (armorCon != null ? !armorCon.equals(that.armorCon) : that.armorCon != null) return false;
        if (hp != null ? !hp.equals(that.hp) : that.hp != null) return false;
        if (mp != null ? !mp.equals(that.mp) : that.mp != null) return false;
        if (def != null ? !def.equals(that.def) : that.def != null) return false;
        if (dodge != null ? !dodge.equals(that.dodge) : that.dodge != null) return false;
        if (repel != null ? !repel.equals(that.repel) : that.repel != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (shop != null ? !shop.equals(that.shop) : that.shop != null) return false;
        if (isEnchant != null ? !isEnchant.equals(that.isEnchant) : that.isEnchant != null) return false;
        if (bindRule != null ? !bindRule.equals(that.bindRule) : that.bindRule != null) return false;
        if (suitId != null ? !suitId.equals(that.suitId) : that.suitId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (descibe != null ? descibe.hashCode() : 0);
        result = 31 * result + (bodypart != null ? bodypart.hashCode() : 0);
        result = 31 * result + (armorType != null ? armorType.hashCode() : 0);
        result = 31 * result + (int) useLevel;
        result = 31 * result + (armorCon != null ? armorCon.hashCode() : 0);
        result = 31 * result + curDur;
        result = 31 * result + maxDur;
        result = 31 * result + (hp != null ? hp.hashCode() : 0);
        result = 31 * result + (mp != null ? mp.hashCode() : 0);
        result = 31 * result + (def != null ? def.hashCode() : 0);
        result = 31 * result + (dodge != null ? dodge.hashCode() : 0);
        result = 31 * result + (repel != null ? repel.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (shop != null ? shop.hashCode() : 0);
        result = 31 * result + (isEnchant != null ? isEnchant.hashCode() : 0);
        result = 31 * result + (bindRule != null ? bindRule.hashCode() : 0);
        result = 31 * result + (suitId != null ? suitId.hashCode() : 0);
        return result;
    }
}
