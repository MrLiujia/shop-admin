create table cellphone( 
       ID integer not null primary key, 
       BRAND varchar2(128),        --Ʒ��
       MODEL varchar2(128) ,       --�ͺ�
       OS varchar2(128),           --����ϵͳ ��IOS��Android��Windows Phone
       CPUBRAND varchar2(128),     --CPUƷ�� ����ͨ�������ƣ�
       RAM integer,                --�ڴ棨��λGB��������
       storage integer,            --�洢���� ����λGB��������
       COLOR varchar2(128),        --��ɫ 
       PRICE integer,              --�۸� 
       DESCRIPTION varchar2(512)  --����
       
);

create sequence SEQ_cellphone
minvalue 1
maxvalue 999
start with 1
increment by 1
nocache;

create or replace trigger TRI_cellphone_ID
  before insert on cellphone 
  for each row
declare
  nextid number;
begin
  IF :new.ID IS NULL or :new.ID=0 THEN
    select SEQ_cellphone.nextval
    into nextid
    from sys.dual;
    :new.ID:=nextid;
  end if;
end TRI_cellphone_ID;  

select * from cellphone
insert into cellphone(BRAND,MODEL,OS,CPUBRAND,RAM,storage,COLOR,PRICE,DESCRIPTION) 
       values(#{brand},#{model},#{os},#{cpubrand},#{ram},#{storage},#{color},#{price},#{description});
insert into cellphone(BRAND,MODEL,OS,CPUBRAND,RAM,storage,COLOR,PRICE,DESCRIPTION) 
       values('Apple','iPhone X','IOS','ƻ��A10',3,64,'��ɫ',7588,'�е��');
insert into cellphone(BRAND,MODEL,OS,CPUBRAND,RAM,storage,COLOR,PRICE,DESCRIPTION) 
       values('OPPO','R15','Android','������',6,128,'����',2699,'������');


insert into cellphone(BRAND,MODEL,OS,CPUBRAND,RAM,storage,COLOR,PRICE,DESCRIPTION) 
       values('12','R1125','1','����1��',6,1128,'����',26199,'������');

insert into cellphone(BRAND, MODEL, OS,CPUBRAND,RAM,ATORAGE,COLOR,PRICE,DESCRIPTION)
		values(#{brand}, #{model}, #{os},#{cpubrand},#{ram},#{storage},#{color},#{price},#{description})

select * from shopuser
create table shopuser( 
       ID integer not null primary key, 
       username varchar2(32);
       password varchar2(64);
       
);
create sequence SEQ_cellphone
minvalue 1
maxvalue 999
start with 1
increment by 1
nocache;

create or replace trigger TRI_cellphone_ID
  before insert on cellphone 
  for each row
declare
  nextid number;
begin
  IF :new.ID IS NULL or :new.ID=0 THEN
    select SEQ_cellphone.nextval
    into nextid
    from sys.dual;
    :new.ID:=nextid;
  end if;
end TRI_cellphone_ID; 

alter table shopuser add(last_time date default sysdate); 

//���ﳵ��
select * from shopuser
select * from cellphone_shopuser
create table cellphone_shopuser(  
       cellphone_id integer  not null ,
       shopuser_id integer  not null, 
       quantity integer,
       constraint PK_cellphone_shopuser primary key (cellphone_id,shopuser_id)
       );
alter table cellphone_shopuser 
add constraint FK_cellphone_user_shopuser_id
  foreign key (shopuser_id) references shopuser (ID); 

alter table cellphone_shopuser 
add constraint FK_cellphone_user_cellphone_id
  foreign key (cellphone_id) references cellphone (ID); 

  
insert into cellphone_shopuser(cellphone_id,shopuser_id,quantity) 
       values(7,8,1);

DELETE FROM cellphone_shopuser c 
		WHERE c.cellphone_id=1 and c.shopuser_id=8
