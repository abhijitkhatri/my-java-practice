{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red144\green1\blue18;\red22\green107\blue41;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c63922\c8235\c8235;\cssrgb\c7451\c48627\c21176;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf0 \strokec4 \'a0java.util.Scanner;\cb1 \
\
\cf2 \cb3 \strokec2 public\cf0 \strokec4 \'a0\cf2 \strokec2 class\cf0 \strokec4 \'a0Solution\'a0\{\cb1 \
\
\pard\pardeftab720\partightenfactor0
\cf0 \cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf0 \strokec4 \'a0\cf2 \strokec2 static\cf0 \strokec4 \'a0\cf2 \strokec2 void\cf0 \strokec4 \'a0main(String[]\'a0args)\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Scanner\'a0sc=\cf2 \strokec2 new\cf0 \strokec4 \'a0Scanner(System.in);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "================================"\cf0 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 for\cf0 \strokec4 (\cf2 \strokec2 int\cf0 \strokec4 \'a0i=\cf6 \strokec6 0\cf0 \strokec4 ;i<\cf6 \strokec6 3\cf0 \strokec4 ;i++)\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String\'a0s1=sc.next();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf0 \strokec4 \'a0x=sc.nextInt();\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\pard\pardeftab720\partightenfactor0
\cf6 \cb3 \strokec6 /*\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0First\'a0of\'a0all\'a0we\'a0will\'a0use\'a0System.out.format\'a0instead\'a0of\'a0System.out.println\'a0as\'a0it\'a0is\'a0use\'a0to\'a0format\'a0the\'a0output.\'a0So\'a0our\'a0code\'a0will\'a0be\'a0\'96>\'a0System.out.format();\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0Next\'a0we\'a0will\'a0use\'a0Modulus(%)\'a0within\'a0double\'a0quote.\'a0So\'a0our\'a0code\'a0will\'a0be\'a0\'96>\'a0System.out.format(\'93%\'a0\'93);\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0Next\'a0we\'a0will\'a0use\'a0\'91-\'91\'a0after\'a0modulus\'a0which\'a0will\'a0instruct\'a0the\'a0compiler\'a0that\'a0it\'a0will\'a0be\'a0left\'a0indent,\'a0if\'a0you\'a0want\'a0to\'a0use\'a0right\'a0indent\'a0do\'a0not\'a0use\'a0\'93-\'93.\'a0So\'a0our\'a0code\'a0will\'a0be\'a0\'96>\'a0System.out.format(\'93%-\'a0\'93);\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0The\'a015\'a0makes\'a0our\'a0String\'a0to\'a0be\'a0a\'a0minimum\'a0length\'a0of\'a015,\'a0it\'a0is\'a0required\'a0as\'a0per\'a0the\'a0question.\'a0So\'a0our\'a0code\'a0will\'a0be\'a0\'96>\'a0System.out.format(\'93%-15\'94);\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0s\'a0will\'a0be\'a0substituted\'a0by\'a0our\'a0String.\'a0This\'a0will\'a0mark\'a0the\'a0end\'a0of\'a0first\'a0requirement.\'a0So\'a0our\'a0code\'a0will\'a0be\'a0\'96>\'a0System.out.format(\'93%-15s\'94);\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0Now\'a0the\'a0second\'a0part\'a0of\'a0the\'a0question.\'a0So\'a0again\'a0we\'a0will\'a0put\'a0%\'a0\'a0and\'a0put\'a03d\'a0in\'a0order\'a0to\'a0\'a0format\'a0integer.\'a0The\'a03\'a0makes\'a0our\'a0integer\'a0be\'a0a\'a0minimum\'a0length\'a0of\'a03.\'a0So\'a0our\'a0code\'a0will\'a0be\'a0\'96>\'a0System.out.format(\'93%-15s%3d\'94);\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 \'a0\'a0\'a0\'a0%n\'a0or\'a0\\n\'a0will\'a0help\'a0to\'a0go\'a0to\'a0the\'a0next\'a0line.\cf0 \cb1 \strokec4 \
\cf6 \cb3 \strokec6 */\cf0 \cb1 \strokec4 \
\
\
\pard\pardeftab720\partightenfactor0
\cf0 \cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.format(\cf5 \strokec5 "%-15s%03d\\n"\cf0 \strokec4 ,\'a0s1,\'a0x);\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "================================"\cf0 \strokec4 );\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
\
\
\
}