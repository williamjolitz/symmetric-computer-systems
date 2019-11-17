;
;  @(#)named.boot.master	1.15	(Berkeley)  87/10/13
;
;  boot file for authoritive name server
; Note that there should be one primary entry for each SOA record.
;

;sortlist 137.0.0.16 135.0.0.1 

; directory	/etc/namedb

; type    domain                 source file, or host and backup file

primary   scs.COM          /etc/namedb/scshosts
cache     .                      /etc/namedb/root.cache
; primary   32.128.IN-ADDR.ARPA    ucbhosts.rev
; primary   0.0.127.IN-ADDR.ARPA   /etc/named/localhost.rev

