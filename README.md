# 云顶之弈Demo版

Java写的一个命令行小玩具，主要模拟了云顶之弈的抽卡功能（不完整

因为很喜欢玩云顶之弈的时候一次抽到很多张想要的卡的感觉，又苦于要看发牌员脸色，所以自己想简单模拟一下云顶之弈的D牌效果

概率总是这样令人迷醉

## 1.0版

最初是想做成网页+Spring的形式，后来发现自己前端苦手，写不来仿云顶之弈棋盘的界面，就摆烂直接命令行了

写的第一版只是一个简单实现，根据等级抽卡，并没有考虑抽卡后卡池里卡牌数量的变化以及玩家手牌每三张相同牌则升星的情况，后续要增加的实现应该会有：

1.场上棋子共同组成的羁绊

2.备战席上限9张牌

3.从商店中选择牌购买以及卖掉已有手牌（但因为没有对战环节，钱的来源不明，再加上最初的想法只是为了模拟d牌的快感，所以实现的时候应该不会涉及到金钱的变化
