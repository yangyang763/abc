package bean;

import java.util.List;

/**
 * Created by samsung on 2016/5/30.
 */
public class GiftBean {

    /**
     * info : [{"id":"5040","name":"《航海归来》72G独家大礼包","gamename":"航海归来","icon":"http://i3.72g.com/upload/201601/201601201042253982.png","remain":100,"gifttype":"1","consume":"0","content":"金币*150w； 礼金*300； 海贼王的秘宝*3； 天使像*1； 西班牙大帆船图纸（珍品）*1"},{"id":"3542","name":"《不良人》72G普通礼包","gamename":"不良人","icon":"http://i3.72g.com/upload/201506/201506041344181170.jpg","remain":"0","gifttype":"1","consume":"0","content":"铜币*2000，女儿红*2，侠客精魄礼盒*1，水判官精魄*1"},{"id":"4873","name":"《王者荣耀》新版本上线礼包","gamename":"王者荣耀","icon":"http://i4.72g.com/upload/201511/201511181059572674.jpg","remain":0,"gifttype":"1","consume":"0","content":"双倍经验卡1天； 2级符文：震击； 2级符文：痛苦； 钻石28 "},{"id":"5661","name":"《风暴部落》礼包","gamename":"风暴部落","icon":"http://i3.72g.com/upload/201605/201605271532506103.png","remain":"76","gifttype":"1","consume":"0","content":"金钱x100000 钻石x50 道具-装备进阶水晶x5 道具-洗练石x10"},{"id":"5660","name":"《大圣驾到》IOS首发狂欢大礼包","gamename":"大圣驾到","icon":"http://i3.72g.com/upload/201605/201605241533192070.jpg","remain":"297","gifttype":"1","consume":"0","content":"将灵*100,战将令*5,银两*1万"},{"id":"5659","name":"《剑侠情缘手游》礼包","gamename":"剑侠情缘手游","icon":"http://i4.72g.com/upload/201604/201604211019126107.jpg","remain":"0","gifttype":"1","consume":"0","content":"玫瑰花X3、幸运草X3、银两X1888"},{"id":"5657","name":"《偶像梦幻祭》新手礼包","gamename":"偶像梦幻祭","icon":"http://i5.72g.com/upload/201507/201507141521207627.jpg","remain":"376","gifttype":"1","consume":"0","content":"30钻4饼干"},{"id":"5656","name":"《MR魔法英雄》独家礼包","gamename":"MR魔法英雄","icon":"http://i4.72g.com/upload/201605/201605250949037848.jpg","remain":"0","gifttype":"1","consume":"0","content":" 钻石*100 异星炮手灵魂石*10 大经验瓶*10 金币*50000 狼蛛符文*1"},{"id":"5655","name":"《问鼎天下》礼包","gamename":"问鼎天下","icon":"http://i4.72g.com/upload/201604/201604291554183905.jpg","remain":"0","gifttype":"1","consume":"0","content":"技能点*10，扫荡券*20，金币*200000"},{"id":"5651","name":"《偶像梦幻祭》高级礼包","gamename":"偶像梦幻祭","icon":"http://i5.72g.com/upload/201507/201507141521207627.jpg","remain":"0","gifttype":"1","consume":"0","content":"88钻10饼干"}]
     * page : {"total":399,"pagesize":10,"page":1,"page_total":40}
     * state : success
     */

    private String state;
    /**
     * id : 5040
     * name : 《航海归来》72G独家大礼包
     * gamename : 航海归来
     * icon : http://i3.72g.com/upload/201601/201601201042253982.png
     * remain : 100
     * gifttype : 1
     * consume : 0
     * content : 金币*150w； 礼金*300； 海贼王的秘宝*3； 天使像*1； 西班牙大帆船图纸（珍品）*1
     */

    private List<InfoBean> info;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        private String id;
        private String name;
        private String gamename;
        private String icon;
        private int remain;
        private String gifttype;
        private String consume;
        private String content;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGamename() {
            return gamename;
        }

        public void setGamename(String gamename) {
            this.gamename = gamename;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getRemain() {
            return remain;
        }

        public void setRemain(int remain) {
            this.remain = remain;
        }

        public String getGifttype() {
            return gifttype;
        }

        public void setGifttype(String gifttype) {
            this.gifttype = gifttype;
        }

        public String getConsume() {
            return consume;
        }

        public void setConsume(String consume) {
            this.consume = consume;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "InfoBean{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", gamename='" + gamename + '\'' +
                    ", icon='" + icon + '\'' +
                    ", remain=" + remain +
                    ", gifttype='" + gifttype + '\'' +
                    ", consume='" + consume + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }
    }
}
