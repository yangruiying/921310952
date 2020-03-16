import java.util.Date;
import java.util.List;

/**
 * 订单实体类
 */
public class shopping {
    /**
     * 收货地址
     */
    private String address;
    /**
     * 价格
     */
    private double price;
    /**
     * 数量
     */
    private int sum;
    /**
     * 订单时间
     */
    private Date time;
    /**
     * 店铺名称
     */
    private String shop;
    /**
     * 商品条目
     */
    List<commodity> list;
    /**
     * 订单编号
     */
    private String id;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<commodity> getList() {
        return list;
    }

    public void setList(List<commodity> list) {
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
/**
 * 商品实体类
 */
class commodity{
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private double price;
    /**
     * 店铺名称
     */
    private String shop;
    /**
     * 商品编号
     */
    private String id;
    /**
     * 商品尺寸
     */
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
