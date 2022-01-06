package homework.second;

/**
 * 现有如下网络图片地址
 * https://imgsa.baidu.com/forum/w%3D580/sign=43e292947c1ed21b79c92eed9d6fddae/6bfab2fb43166d228b3c16f2472309f79052d20a.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=ead34ea6f636afc30e0c3f6d8318eb85/eb38b6003af33a8700cc037cc75c10385343b530.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=8f05a96bf9dcd100cd9cf829428a47be/5cd8f2d3572c11df1d2ebc45622762d0f603c2de.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=d48d74f1d833c895a67e9873e1127397/244d510fd9f9d72abbf0137bd52a2834359bbbc5.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=629e16f2472309f7e76fad1a420f0c39/b3b0cb1349540923f08060189358d109b2de49ef.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=0624b14e377adab43dd01b4bbbd5b36b/eea30cf431adcbef88347c60adaf2edda3cc9f51.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=7ae9c585562c11dfded1bf2b53276255/aeee76c6a7efce1b8526caacae51f3deb48f6543.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=6400ea9250da81cb4ee683c56267d0a4/782209f790529822bb603ba5d6ca7bcb0a46d402.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=4da50e8db7fd5266a72b3c1c9b199799/a623720e0cf3d7cab7a53d10f31fbe096b63a902.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=b00697ba09fa513d51aa6cd60d6c554c/b25594eef01f3a290c7cd7a89825bc315c607c24.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=2329896332fa828bd1239debcd1f41cd/8d1d8701a18b87d6b868a679060828381f30fdab.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=8c08ad9cd0c8a786be2a4a065709c9c7/8698a9014c086e06b482322d03087bf40ad1cbab.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=d1295f5fc83d70cf4cfaaa05c8dcd1ba/347a02087bf40ad1ccceca85562c11dfa9ecceab.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=136fd172b999a9013b355b3e2d940a58/45ed54e736d12f2eb567a3064ec2d56285356872.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=644582f7cc11728b302d8c2af8fdc3b3/2fdea9ec8a136327d795cf55908fa0ec08fac759.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=0ce4f547738b4710ce2ffdc4f3cfc3b2/97ed8a13632762d04146a9d9a1ec08fa513dc659.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=0cb6f547738b4710ce2ffdc4f3cec3b2/97ed8a13632762d04114a9d9a1ec08fa513dc6ab.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=cb8b178ba2cc7cd9fa2d34d109012104/88fc5266d0160924cc3cae7dd50735fae6cd34bf.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=225b886332fa828bd1239debcd1e41cd/8d1d8701a18b87d6b91aa779060828381f30fd79.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=cbdce0e24bed2e73fce98624b700a16d/0faccbef76094b365109148ba2cc7cd98d109d3a.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=d7ab0efe5fdf8db1bc2e7c6c3922dddb/f1fd1e178a82b901c15bcc55728da9773812efe7.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=bedb33ac503d26972ed3085565fab24f/aaeff01f3a292df5fec9a273bd315c6034a8734a.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=eb1daad9a1ec08fa260013af69ee3d4d/8a8e8c5494eef01f263716a3e1fe9925bc317db1.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=6a0b0fcd023b5bb5bed720f606d2d523/abcbd1c8a786c9173d015c5fc83d70cf3bc75752.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=8c515635f7246b607b0eb27cdbf91a35/5280800a19d8bc3e836d0eac838ba61ea8d3456b.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=77ea9ad0c8177f3e1034fc0540cf3bb9/72096e061d950a7ba42a46a20bd162d9f2d3c9be.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=e3d8f7d664380cd7e61ea2e59145ad14/fdfcfc039245d6888799bac2a5c27d1ed21b2439.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=1b429632024f78f0800b9afb49300a83/2bcf36d3d539b600da5c07d1e850352ac75cb7c3.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=eb3acf493b292df597c3ac1d8c305ce2/47300a55b319ebc4c8917cff8326cffc1f1716ef.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=673e0657203fb80e0cd161df06d02ffb/a92ad40735fae6cd1d5ea1070eb30f2443a70fea.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=594b4c658644ebf86d716437e9f9d736/823fb13533fa828b9435e885fc1f4134970a5a46.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=00748de1d1a20cf44690fed746084b0c/ec1a0ef41bd5ad6e84326e8c80cb39dbb7fd3c89.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=a4beb655728da9774e2f86238051f872/32d6912397dda144431a19d4b3b7d0a20cf48642.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=eb3f90f40df431adbcd243317b37ac0f/30f51bd5ad6eddc40852c19d38dbb6fd5266331b.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=5692ab92b64543a9f51bfac42e168a7b/f85d10385343fbf2579ad345b17eca8065388f27.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=25475e418b82b9013dadc33b438ca97e/ad12b07eca806538e66cd17596dda144ac3482d7.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=eb0990f40df431adbcd243317b37ac0f/30f51bd5ad6eddc40864c19d38dbb6fd536633d1.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=fd06f6ab5366d0167e199e20a72ad498/4c0f0cf3d7ca7bcbce9bb249bf096b63f724a8f1.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=030c077508f79052ef1f47363cf2d738/f51249540923dd5475e6d30ed009b3de9c82483b.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=c3ce98e24bed2e73fce98624b700a16d/0faccbef76094b36591b6c8ba2cc7cd98c109dc8.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=e8dcfb44c9fcc3ceb4c0c93ba244d6b7/5cd1f703918fa0eca736136b279759ee3c6ddbe0.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=b19dda070eb30f24359aec0bf895d192/32328744ebf81a4c9b1b9dafd62a6059252da6a8.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=ed6845bf3801213fcf334ed464e636f8/9519972bd40735fa86b53fdf9f510fb30f24080b.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=6762c1c2a5c27d1ea5263bcc2bd4adaf/036c55fbb2fb4316de7f091c21a4462309f7d371.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=f2943d9d0b46f21fc9345e5bc6256b31/8ddf9c82d158ccbf49dfc65c18d8bc3eb1354171.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=8c1d9b02574e9258a63486e6ac83d1d1/4d8ca9773912b31b356fbe4f8718367adab4e152.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=8ef0e2594afbfbeddc59367748f1f78e/3d3a5bb5c9ea15cee28c936fb7003af33a87b273.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=a2afb055728da9774e2f86238050f872/32d6912397dda144450b1fd4b3b7d0a20cf48653.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=9c8e305f4a36acaf59e096f44cd88d03/6fdb81cb39dbb6fd050796400824ab18972b377c.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=a4d7cc45622762d0803ea4b790ed0849/a317fdfaaf51f3deb9b4ca0295eef01f3a297956.jpg
 * https://imgsa.baidu.com/forum/w%3D580/sign=f2823d9d0b46f21fc9345e5bc6256b31/8ddf9c82d158ccbf49c9c65c18d8bc3eb135415b.jpg
 *
 * 使用多线程下载图片文件（将网络上的图片拷贝到本地）
 *
 * 提示：已知图片地址，获取图片输入流的代码为：
 * URL url = new URL("图片地址");
 * URLConnection conn = url.openConnection();
 * InputStream in = conn.getInputStream();
 *
 * // 将输入流数据读入，写到本地文件输出流
 * 要求：
 *
 * 1. 利用线程池实现
 *
 * 2. 同一时刻最多运行 10 个任务
 *
 * 3. 主线程等待所有文件下载结束，打印信息【下载完成】
 * >
 */
public class second {

}
