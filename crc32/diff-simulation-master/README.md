# diff-simulation
clique: simulate diff_inturn and diff_noturn chains, https://github.com/goerli/eips-poa/issues/13

### deps

requires **ruby 2.6** and the **colorize** gem: `gem install colorize`

### run 1 simulation

run 1 chain simulation with `diff_inturn=2`, `diff_noturn=1`, `peer_count=8`, and `net_fragmentation=0.001`

```bash
ruby ./diff.rb 2 1 8 0.001 true
```
the last argument `true` enables debug logging to display the actual chain simulation:

```bash
2019-07-08 18:48:24 [SEAL] Peer 6ab547e6 (head 28f66f626df1) sealed INTURN block 1721, diff 13384, hash d9ba62f783ac, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer 0d7383f5 (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash fb633efb3c11, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer 2060dac8 (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash 8519447fa5f6, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer b2f2d1f1 (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash 393e054b3321, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer a4f55b9f (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash f6ca5ecc2d39, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer d2038612 (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash 88e4964c429b, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer d1898681 (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash 0abc69127835, parent 28f66f626df1
2019-07-08 18:48:24 [SEAL] Peer 6da7ede8 (head 28f66f626df1) sealed NOTURN block 1721, diff 13378, hash 0e999a613c34, parent 28f66f626df1
2019-07-08 18:48:24 [NETW] Peer 2060dac8 (head 8519447fa5f6) reorg to d9ba62f783ac (13384) from peer 6ab547e6
2019-07-08 18:48:24 [NETW] Peer b2f2d1f1 (head 393e054b3321) reorg to d9ba62f783ac (13384) from peer 6ab547e6
2019-07-08 18:48:24 [NETW] Peer a4f55b9f (head f6ca5ecc2d39) reorg to d9ba62f783ac (13384) from peer 6ab547e6
2019-07-08 18:48:24 [NETW] Peer d2038612 (head 88e4964c429b) reorg to d9ba62f783ac (13384) from peer 6ab547e6
2019-07-08 18:48:24 [NETW] Peer d1898681 (head 0abc69127835) reorg to d9ba62f783ac (13384) from peer 6ab547e6
2019-07-08 18:48:24 [NETW] Peer 6da7ede8 (head 0e999a613c34) reorg to d9ba62f783ac (13384) from peer 6ab547e6
2019-07-08 18:48:24 [SEAL] Peer 6ab547e6 (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash a447873ad104, parent d9ba62f783ac
2019-07-08 18:48:24 [SEAL] Peer 0d7383f5 (head fb633efb3c11) sealed INTURN block 1722, diff 13385, hash fca17484e138, parent fb633efb3c11
2019-07-08 18:48:24 [SEAL] Peer 2060dac8 (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash 760bd06dd838, parent d9ba62f783ac
2019-07-08 18:48:24 [SEAL] Peer b2f2d1f1 (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash 629d32cbcabb, parent d9ba62f783ac
2019-07-08 18:48:24 [SEAL] Peer a4f55b9f (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash a18b467ab30c, parent d9ba62f783ac
2019-07-08 18:48:24 [SEAL] Peer d2038612 (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash c501f7718dfc, parent d9ba62f783ac
2019-07-08 18:48:24 [SEAL] Peer d1898681 (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash 107056ab3394, parent d9ba62f783ac
2019-07-08 18:48:24 [SEAL] Peer 6da7ede8 (head d9ba62f783ac) sealed NOTURN block 1722, diff 13385, hash 1202b41b493b, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Network is stuck:
2019-07-08 18:48:24 [SIML] Peer 6ab547e6, block 1722, diff 13385, hash a447873ad104, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Peer 0d7383f5, block 1722, diff 13385, hash fca17484e138, parent fb633efb3c11
2019-07-08 18:48:24 [SIML] Peer 2060dac8, block 1722, diff 13385, hash 760bd06dd838, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Peer b2f2d1f1, block 1722, diff 13385, hash 629d32cbcabb, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Peer a4f55b9f, block 1722, diff 13385, hash a18b467ab30c, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Peer d2038612, block 1722, diff 13385, hash c501f7718dfc, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Peer d1898681, block 1722, diff 13385, hash 107056ab3394, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Peer 6da7ede8, block 1722, diff 13385, hash 1202b41b493b, parent d9ba62f783ac
2019-07-08 18:48:24 [SIML] Network is stuck... Exiting.
```

### run monte-carlo simulation

to run a monte-carlo simulation, adapt and use the bash script

```bash
./diff.sh
```

result can be parsed as CSV:

```csv
peer_count,diff_inturn,diff_noturn,blocks_chain,blocks_target,net_fragmentation,num_reorgs
8,2,1,2058,1000000,0.001,14398
8,2,1,1457,1000000,0.001,10191
8,2,1,482,1000000,0.001,3366
8,2,1,2609,1000000,0.001,18255
8,2,1,57,1000000,0.001,391
8,2,1,417,1000000,0.001,2911
8,2,1,11322,1000000,0.001,79246
8,2,1,1674,1000000,0.001,11710
8,2,1,697,1000000,0.001,4871
8,2,1,433,1000000,0.001,3023
8,2,1,5281,1000000,0.001,36959
8,2,1,3274,1000000,0.001,22910
8,2,1,16929,1000000,0.001,118494
8,2,1,10074,1000000,0.001,70510
8,2,1,3378,1000000,0.001,23638
8,2,1,3298,1000000,0.001,23078
8,2,1,4898,1000000,0.001,34278
8,2,1,8234,1000000,0.001,57630
8,2,1,810,1000000,0.001,5662
8,2,1,2081,1000000,0.001,14559
8,2,1,4602,1000000,0.001,32206
8,2,1,418,1000000,0.001,2918
8,2,1,425,1000000,0.001,2967
8,2,1,2610,1000000,0.001,18262
8,2,1,2433,1000000,0.001,17023
8,2,1,2058,1000000,0.001,14398
8,2,1,2497,1000000,0.001,17471
8,2,1,6321,1000000,0.001,44239
8,2,1,6057,1000000,0.001,42391
8,2,1,5705,1000000,0.001,39927
8,2,1,5914,1000000,0.001,41390
8,2,1,273,1000000,0.001,1903
8,2,1,842,1000000,0.001,5886
8,2,1,6497,1000000,0.001,45471
8,2,1,5874,1000000,0.001,41110
8,2,1,4313,1000000,0.001,30183
8,2,1,913,1000000,0.001,6383
8,2,1,1721,1000000,0.001,12039
8,2,1,3538,1000000,0.001,24758
8,2,1,4473,1000000,0.001,31303
8,2,1,9817,1000000,0.001,68711
8,2,1,2185,1000000,0.001,15287
8,2,1,1202,1000000,0.001,8406
8,2,1,6993,1000000,0.001,48943
8,2,1,2306,1000000,0.001,16134
8,2,1,12273,1000000,0.001,85903
8,2,1,5762,1000000,0.001,40326
8,2,1,1265,1000000,0.001,8847
8,2,1,34,1000000,0.001,230
8,2,1,2225,1000000,0.001,15567
8,2,1,5729,1000000,0.001,40095
8,2,1,4569,1000000,0.001,31975
8,2,1,1538,1000000,0.001,10758
8,2,1,10,1000000,0.001,62
8,2,1,3225,1000000,0.001,22567
8,2,1,2609,1000000,0.001,18255
8,2,1,2313,1000000,0.001,16183
8,2,1,889,1000000,0.001,6215
8,2,1,5945,1000000,0.001,41607
8,2,1,3009,1000000,0.001,21055
8,2,1,986,1000000,0.001,6894
8,2,1,6329,1000000,0.001,44295
8,2,1,6658,1000000,0.001,46598
8,2,1,7170,1000000,0.001,50182
8,2,1,3506,1000000,0.001,24534
8,2,1,3609,1000000,0.001,25255
8,2,1,6034,1000000,0.001,42230
8,2,1,146,1000000,0.001,1014
8,2,1,4546,1000000,0.001,31814
8,2,1,1305,1000000,0.001,9127
8,2,1,6882,1000000,0.001,48166
8,2,1,3993,1000000,0.001,27943
8,2,1,402,1000000,0.001,2806
8,2,1,6554,1000000,0.001,45870
8,2,1,3090,1000000,0.001,21622
8,2,1,385,1000000,0.001,2687
8,2,1,1650,1000000,0.001,11542
8,2,1,2281,1000000,0.001,15959
8,2,1,1930,1000000,0.001,13502
8,2,1,1177,1000000,0.001,8231
8,2,1,1049,1000000,0.001,7335
8,2,1,6497,1000000,0.001,45471
8,2,1,3673,1000000,0.001,25703
8,2,1,6737,1000000,0.001,47151
8,2,1,281,1000000,0.001,1959
8,2,1,2410,1000000,0.001,16862
8,2,1,1905,1000000,0.001,13327
8,2,1,5514,1000000,0.001,38590
8,2,1,2634,1000000,0.001,18430
8,2,1,401,1000000,0.001,2799
8,2,1,1665,1000000,0.001,11647
8,2,1,6889,1000000,0.001,48215
8,2,1,3218,1000000,0.001,22518
8,2,1,13346,1000000,0.001,93414
8,2,1,6586,1000000,0.001,46094
8,2,1,1754,1000000,0.001,12270
8,2,1,3722,1000000,0.001,26046
8,2,1,3018,1000000,0.001,21118
8,2,1,746,1000000,0.001,5214
8,2,1,6201,1000000,0.001,43399
8,2,1,441,1000000,0.001,3079
8,2,1,4170,1000000,0.001,29182
8,2,1,1458,1000000,0.001,10198
8,2,1,4962,1000000,0.001,34726
8,2,1,274,1000000,0.001,1910
8,2,1,34,1000000,0.001,230
8,2,1,8225,1000000,0.001,57567
8,2,1,12794,1000000,0.001,89550
8,2,1,1745,1000000,0.001,12207
8,2,1,11873,1000000,0.001,83103
8,2,1,2561,1000000,0.001,17919
8,2,1,6834,1000000,0.001,47830
8,2,1,6241,1000000,0.001,43679
8,2,1,1618,1000000,0.001,11318
8,2,1,1890,1000000,0.001,13222
8,2,1,289,1000000,0.001,2015
8,2,1,561,1000000,0.001,3919
8,2,1,7138,1000000,0.001,49958
8,2,1,1097,1000000,0.001,7671
8,2,1,2121,1000000,0.001,14839
8,2,1,1410,1000000,0.001,9862
8,2,1,6658,1000000,0.001,46598
8,2,1,961,1000000,0.001,6719
8,2,1,6881,1000000,0.001,48159
8,2,1,2681,1000000,0.001,18759
8,2,1,6482,1000000,0.001,45366
8,2,1,5361,1000000,0.001,37519
8,2,1,6090,1000000,0.001,42622
8,2,1,5898,1000000,0.001,41278
8,2,1,3289,1000000,0.001,23015
8,2,1,2073,1000000,0.001,14503
8,2,1,5593,1000000,0.001,39143
8,2,1,2321,1000000,0.001,16239
8,2,1,2162,1000000,0.001,15126
8,2,1,14785,1000000,0.001,103487
8,2,1,2585,1000000,0.001,18087
8,2,1,5289,1000000,0.001,37015
8,2,1,3530,1000000,0.001,24702
8,2,1,1058,1000000,0.001,7398
8,2,1,4178,1000000,0.001,29238
8,2,1,3122,1000000,0.001,21846
8,2,1,306,1000000,0.001,2134
8,2,1,7617,1000000,0.001,53311
8,2,1,257,1000000,0.001,1791
8,2,1,577,1000000,0.001,4031
8,2,1,6738,1000000,0.001,47158
8,2,1,7289,1000000,0.001,51015
8,2,1,5370,1000000,0.001,37582
8,2,1,10089,1000000,0.001,70615
8,2,1,6746,1000000,0.001,47214
8,2,1,4106,1000000,0.001,28734
8,2,1,1402,1000000,0.001,9806
8,2,1,945,1000000,0.001,6607
8,2,1,1841,1000000,0.001,12879
8,2,1,1561,1000000,0.001,10919
8,2,1,5857,1000000,0.001,40991
8,2,1,1922,1000000,0.001,13446
8,2,1,1050,1000000,0.001,7342
8,2,1,3722,1000000,0.001,26046
8,2,1,1290,1000000,0.001,9022
8,2,1,1858,1000000,0.001,12998
8,2,1,225,1000000,0.001,1567
8,2,1,313,1000000,0.001,2183
8,2,1,5186,1000000,0.001,36293
8,2,1,4961,1000000,0.001,34719
8,2,1,3313,1000000,0.001,23183
8,2,1,1089,1000000,0.001,7615
8,2,1,8353,1000000,0.001,58463
8,2,1,5898,1000000,0.001,41278
8,2,1,2297,1000000,0.001,16071
8,2,1,3977,1000000,0.001,27831
8,2,1,593,1000000,0.001,4143
8,2,1,4154,1000000,0.001,29070
8,2,1,466,1000000,0.001,3254
8,2,1,450,1000000,0.001,3142
8,2,1,49,1000000,0.001,335
8,2,1,2753,1000000,0.001,19263
8,2,1,4457,1000000,0.001,31191
8,2,1,3402,1000000,0.001,23806
8,2,1,249,1000000,0.001,1735
8,2,1,6665,1000000,0.001,46647
8,2,1,6386,1000000,0.001,44694
8,2,1,10,1000000,0.001,62
8,2,1,1114,1000000,0.001,7790
8,2,1,5465,1000000,0.001,38247
8,2,1,7921,1000000,0.001,55439
8,2,1,1409,1000000,0.001,9855
8,2,1,169,1000000,0.001,1175
8,2,1,7186,1000000,0.001,50294
8,2,1,15250,1000000,0.001,106742
8,2,1,1961,1000000,0.001,13719
8,2,1,817,1000000,0.001,5711
8,2,1,954,1000000,0.001,6670
8,2,1,1369,1000000,0.001,9575
8,2,1,2210,1000000,0.001,15462
8,2,1,922,1000000,0.001,6446
8,2,1,1810,1000000,0.001,12662
8,2,1,2906,1000000,0.001,20334
8,2,1,7929,1000000,0.001,55495
8,2,1,3513,1000000,0.001,24583
8,2,1,1882,1000000,0.001,13166
8,2,1,961,1000000,0.001,6719
8,2,1,4186,1000000,0.001,29294
8,2,1,433,1000000,0.001,3023
8,2,1,1826,1000000,0.001,12774
8,2,1,498,1000000,0.001,3478
8,2,1,2898,1000000,0.001,20278
8,2,1,698,1000000,0.001,4878
8,2,1,10930,1000000,0.001,76502
8,2,1,1922,1000000,0.001,13446
8,2,1,10,1000000,0.001,62
8,2,1,82,1000000,0.001,566
8,2,1,3330,1000000,0.001,23302
8,2,1,682,1000000,0.001,4766
8,2,1,10937,1000000,0.001,76551
8,2,1,2137,1000000,0.001,14951
8,2,1,553,1000000,0.001,3863
8,2,1,145,1000000,0.001,1007
8,2,1,466,1000000,0.001,3254
8,2,1,3345,1000000,0.001,23407
8,2,1,3033,1000000,0.001,21223
8,2,1,7122,1000000,0.001,49846
8,2,1,1153,1000000,0.001,8063
8,2,1,9554,1000000,0.001,66870
8,2,1,873,1000000,0.001,6103
8,2,1,9474,1000000,0.001,66310
8,2,1,5642,1000000,0.001,39486
8,2,1,2401,1000000,0.001,16799
8,2,1,329,1000000,0.001,2295
8,2,1,12298,1000000,0.001,86078
8,2,1,4162,1000000,0.001,29126
8,2,1,626,1000000,0.001,4374
8,2,1,14929,1000000,0.001,104495
8,2,1,146,1000000,0.001,1014
8,2,1,617,1000000,0.001,4311
8,2,1,6337,1000000,0.001,44351
8,2,1,937,1000000,0.001,6551
8,2,1,849,1000000,0.001,5935
8,2,1,1713,1000000,0.001,11983
8,2,1,6850,1000000,0.001,47942
8,2,1,3418,1000000,0.001,23918
8,2,1,3553,1000000,0.001,24863
```