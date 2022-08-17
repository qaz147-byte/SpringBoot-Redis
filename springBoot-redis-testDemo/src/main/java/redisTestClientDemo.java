import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * 测试连接redis
 * @author cheng.chen8
 */
public class redisTestClientDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.230.129", 6379);
        jedis.auth("qilin555");
        String ping = jedis.ping();
        System.out.println(ping+"连接成功");

        //key
/*      jedis.set("k1","v1");
        jedis.set("k2","v2");
        jedis.set("k3","v3");

        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
        // 遍历获得key
        for (String key : keys) {
            System.out.println(key);
        }*/

        //String
/*      jedis.mset("str1","v1","str2","v2","str3","v3");
        System.out.println(jedis.mget("str1","str2","str3"));*/

        //list
//        jedis.lpush("mylist", "cc", "redis");
//        jedis.lpush("mylist","afs","hajfh");
//        List<String> list = jedis.lrange("mylist", 0, -1);
//        for (String s : list) {
//            System.out.println(s);
//        }

        //set
//        jedis.sadd("orders", "order01");
//        jedis.sadd("orders", "order02");
//        jedis.sadd("orders", "order03");
//        jedis.sadd("orders", "order04");
//        Set<String> smembers = jedis.smembers("orders");
//        for (String order : smembers) {
//            System.out.println(order);
//        }
        //删除某个元素
//        jedis.srem("orders","order03");

//        jedis.hset("hash1","userName","lisi");
//        System.out.println(jedis.hget("hash1","userName"));
//        Map<String,String> map = new HashMap<String,String>();
//        map.put("phone","1324564878");
//        map.put("address","test");
//        map.put("email","jfhasj@qq.com");
//        jedis.hmset("hash2",map);
//        List<String> result = jedis.hmget("hash2", "phone","email");
//        for (String element : result) {
//            System.out.println(element);
//        }

        jedis.zadd("zset01", 100d, "z3");
        jedis.zadd("zset01", 90d, "l4");
        jedis.zadd("zset01", 80d, "w5");
        jedis.zadd("zset01", 70d, "z6");

        Set<String> zrange = jedis.zrange("zset01", 0, -1);
        for (String e : zrange) {
            System.out.println(e);
        }

        jedis.close();
    }
}
