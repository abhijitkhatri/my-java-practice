{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red22\green107\blue41;\red144\green1\blue18;\red255\green255\blue254;\red144\green1\blue18;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c7451\c48627\c21176;\cssrgb\c63922\c8235\c8235;\cssrgb\c100000\c100000\c99608;\cssrgb\c63922\c8235\c8235;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
import\cf0 \'a0java.io.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.math.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.security.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.text.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.util.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.util.concurrent.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.util.function.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.util.regex.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0java.util.stream.*;\cb1 \
\cf2 \cb3 import\cf0 \'a0\cf2 static\cf0 \'a0java.util.stream.Collectors.joining;\cb1 \
\cf2 \cb3 import\cf0 \'a0\cf2 static\cf0 \'a0java.util.stream.Collectors.toList;\cb1 \
\
\
\
\cf2 \cb3 public\cf0 \'a0\cf2 class\cf0 \'a0Solution\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\cf2 public\cf0 \'a0\cf2 static\cf0 \'a0\cf2 void\cf0 \'a0main(String[]\'a0args)\'a0\cf2 throws\cf0 \'a0IOException\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0BufferedReader\'a0bufferedReader\'a0=\'a0\cf2 new\cf0 \'a0BufferedReader(\cf2 new\cf0 \'a0InputStreamReader(System.in));\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 int\cf0 \'a0N\'a0=\'a0Integer.parseInt(bufferedReader.readLine().trim());\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 for\cf0 (\cf2 int\cf0 \'a0i=\cf5 1\cf0 ;\'a0i<\cf5 11\cf0 ;\'a0i++)\{\cb1 \
\cb3 	//\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(N\'a0+\'a0\cf6 "\'a0x\'a0"\cf0 \'a0+\'a0i\'a0+\'a0\cf6 "\'a0=\'a0"\cf0 \'a0+\'a0N*i);\
			\cb7 \outl0\strokewidth0 \strokec4 System.out.format(\cf8 \strokec8 "%d\'a0x\'a0%d\'a0=\'a0%d\\n"\cf0 \strokec4 ,\'a0N,\'a0i,\'a0N*i);\cb1 \outl0\strokewidth0 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0bufferedReader.close();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
}