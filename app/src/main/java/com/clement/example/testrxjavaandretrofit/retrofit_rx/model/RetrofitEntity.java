package com.clement.example.testrxjavaandretrofit.retrofit_rx.model;

import java.util.List;

/**网络请求回来的实体类
 * Created by clement on 16/11/4.
 */

public class RetrofitEntity {

    /**
     * ret : 1
     * msg : 成功
     * data : [{"id":0,"name":"qianyan.mp4","url":"https://bj.bcebos.com/course-mct/media/qianyan.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A00Z%2F6000%2F%2F876dc982f5ec9790714470a0fc64a3a228ca9f7f44217ce7f7f8f6f7fb68d515","title":"前言"},{"id":1,"name":"a.mp4","url":"https://bj.bcebos.com/course-mct/media/a.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A00Z%2F6000%2F%2Ff57e8eb876df08e1fa95049c014081da70cc3ecf5e6d08cac7a24509b58b0326","title":"五十音图\u2014\u2014あ行"},{"id":2,"name":"ka.mp4","url":"https://bj.bcebos.com/course-mct/media/ka.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A00Z%2F6000%2F%2Fd0b975f823e2844be8c4139e7f11d4b5fc2097565a55f094ec05aa380dc29e2c","title":"五十音图\u2014\u2014か行"},{"id":3,"name":"sa.mp4","url":"https://bj.bcebos.com/course-mct/media/sa.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A00Z%2F6000%2F%2F3a8e9ce5e4dd56a04197a9c3b100e6577c8a0ad35a27416f0f45fe2321ce5a23","title":"五十音图\u2014\u2014さ行"},{"id":4,"name":"ta.mp4","url":"https://bj.bcebos.com/course-mct/media/ta.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A00Z%2F6000%2F%2Fc211e88916303c468e272446bfe0f9f860af5fe2d73f0c15ce4f9dfe1f681302","title":"五十音图\u2014\u2014た行"},{"id":5,"name":"na.mp4","url":"https://bj.bcebos.com/course-mct/media/na.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A01Z%2F6000%2F%2F09f242128413bb093b3d6f0c876a50ef8683518df2e819198691a20f6ba6b313","title":"五十音图\u2014\u2014な行"},{"id":6,"name":"ha.mp4","url":"https://bj.bcebos.com/course-mct/media/ha.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A01Z%2F6000%2F%2F7ca4984b804881843e3bff861885dd5e711381dc83098bab89e7ac02533e4b37","title":"五十音图\u2014\u2014は行"},{"id":7,"name":"ma.mp4","url":"https://bj.bcebos.com/course-mct/media/ma.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A01Z%2F6000%2F%2Fb3098ddafed5bcf0ff2b0e1571b15650f7616fa677c9c1d40f5bec6ed2a98336","title":"五十音图\u2014\u2014ま行"},{"id":8,"name":"ya.mp4","url":"https://bj.bcebos.com/course-mct/media/ya.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A01Z%2F6000%2F%2F99f4b505503c61801efca9f095e62de18ba60cd4dd3c3d52830e1c52b11f2d14","title":"五十音图\u2014\u2014や行"},{"id":9,"name":"ra.mp4","url":"https://bj.bcebos.com/course-mct/media/ra.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A02Z%2F6000%2F%2F96fec2860bfdec33957e2b17354cd1c1e284aa3a51a047b1fdf5824fb1e1435b","title":"五十音图\u2014\u2014ら行"},{"id":10,"name":"wa.mp4","url":"https://bj.bcebos.com/course-mct/media/wa.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A02Z%2F6000%2F%2F0fdfff18440401097264aea9536744871220b7481ccea32804cbade359af3ac4","title":"五十音图\u2014\u2014わ行"},{"id":11,"name":"zhuoyin.mp4","url":"https://bj.bcebos.com/course-mct/media/zhuoyin.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A02Z%2F6000%2F%2F1ce90b77fad2e7da1c14ec1cb6e78875637ea68bd05a193826b06295dc4d2118","title":"五十音图\u2014\u2014浊音"},{"id":12,"name":"yindiao.mp4","url":"https://bj.bcebos.com/course-mct/media/yindiao.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A02Z%2F6000%2F%2Fe50097c0956a56f2950d4a09f8a12cd002e84720225c05643bd4a0aa13d6d638","title":"五十音图\u2014\u2014音调"},{"id":13,"name":"riwenhanzi.mp4","url":"https://bj.bcebos.com/course-mct/media/riwenhanzi.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A03Z%2F6000%2F%2F3a2b79b1d794acd5a4f3dab5242f279d167d1d76357f768351c4f90bc1e9d61f","title":"五十音图\u2014\u2014日文汉字"},{"id":14,"name":"cuyin.mp4","url":"https://bj.bcebos.com/course-mct/media/cuyin.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A03Z%2F6000%2F%2F1249faad90298d8bf94c784790e108093446c3743cd43bf025f4316e528b0810","title":"五十音图\u2014\u2014促音"},{"id":15,"name":"boyin.mp4","url":"https://bj.bcebos.com/course-mct/media/boyin.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A03Z%2F6000%2F%2F439b303277013160d74d4ab6cb4d8826ee4f0eadaf318c97884d89dcb6d72d3b","title":"五十音图\u2014\u2014拨音"},{"id":16,"name":"aoyin.mp4","url":"https://bj.bcebos.com/course-mct/media/aoyin.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A03Z%2F6000%2F%2F314a7dcd6cacd13800485a63a98af312bb3ab627dc55df8afd3e8059352a5e24","title":"五十音图\u2014\u2014拗音"},{"id":17,"name":"changyin.mp4","url":"https://bj.bcebos.com/course-mct/media/changyin.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A04Z%2F6000%2F%2F64b8680f8304021b34c9970caba0763cee9fe453d4b41dcdfaa68ddd248de539","title":"五十音图\u2014\u2014长音"},{"id":18,"name":"50yinjieshu.mp4","url":"https://bj.bcebos.com/course-mct/media/50yinjieshu.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A04Z%2F6000%2F%2Fc0132ed6853a68a06d8d84a9005ed1b0fd1b2f6f7f02aa1ca84d791270e5820d","title":"结束"}]
     */

    private int ret;
    private String msg;
    /**
     * id : 0
     * name : qianyan.mp4
     * url : https://bj.bcebos.com/course-mct/media/qianyan.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-04T08%3A31%3A00Z%2F6000%2F%2F876dc982f5ec9790714470a0fc64a3a228ca9f7f44217ce7f7f8f6f7fb68d515
     * title : 前言
     */

    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int id;
        private String name;
        private String url;
        private String title;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
