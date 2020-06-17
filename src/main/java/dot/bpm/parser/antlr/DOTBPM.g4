grammar DOTBPM;

process           :   PROCESS id CURLY_OPEN (stmt_list | pool_list) CURLY_CLOSE EOF ;
subprocess        :   SUBPROCESS id CURLY_OPEN stmt_list (VERT_LINE boundary_event)* CURLY_CLOSE ;
pool_list         :   pool+ ;
pool_header       :   id (STMT_TERM attr_list)? ;
pool              :   POOL_OPEN pool_header VERT_LINE (stmt_list | lane_list) POOL_CLOSE ;
lane_list         :   lane+ ;
lane_header       :   id (STMT_TERM attr_list)? ;
lane              :   LANE_OPEN lane_header VERT_LINE stmt_list LANE_CLOSE ;

stmt_list         :   (stmt STMT_TERM?)* ;
stmt              :   sequence | sequence_elem | association ;
sequence          :   sequence_elem sequence_flow sequence_elem (sequence_flow sequence_elem)* ;
sequence_elem     :   activity | gateway | event | link ;
activity          :   task | subprocess ;
task              :   SQRE_OPEN task_type id
                      (STMT_TERM attr_list)?                    /* attributes for task */
                      (VERT_LINE (input_set)? (output_set)?)?   /* input/output sets */
                      (VERT_LINE boundary_event)*               /* associated boundary events */
                      SQRE_CLOSE ;
task_type         :   USER | SERVICE | SCRIPT ;
event             :   PAREN_OPEN (event_type | event_category | event_category ':' event_type ) id (VERT_LINE attr_list)? PAREN_CLOSE ;
event_category    :   ANGLE_CLOSE | SLASH | CATCH | THROW ;
event_type        :   X_BANG      /* terminate event */
                      | BACKWARD  /* compensate event */
                      | X         /* cancel event */
                      | STAR      /* multi-event */
                      | PLUS      /* multiple parallel event */
                      | BANG      /* signal event */
                      | QUESTION  /* conditional event */
                      | CARET     /* escalation event */
                      | TILDE     /* error event */
                      | AT_SYMB   /* message event */
                      | ELLIPSIS  /* timer event */
                      ;
boundary_event    :   event sequence_flow link;
gateway           :   ANGLE_OPEN (fork_diverge | condition_diverge | event_diverge | and_converge | or_converge) ANGLE_CLOSE ;
fork_diverge      :   FORK id (VERT_LINE attr_list)? VERT_LINE outflows ;
event_diverge     :   EVENT_SPLIT VERT_LINE event_links ;
condition_diverge :   (OR_SPLIT | XOR_SPLIT) id (VERT_LINE attr_list)? VERT_LINE cond_outflows ;
and_converge      :   JOIN id (VERT_LINE attr_list)? (VERT_LINE inflows)? ;
or_converge       :   (XOR_JOIN | OR_JOIN) id (VERT_LINE attr_list)? (VERT_LINE inflows)? ;
inflows           :   IN ':' link_list ;
outflows          :   OUT ':' link_list ;
cond_outflows     :   OUT ':' cond_outflow (',' cond_outflow)* (DEFAULT ':' link)?;
cond_outflow      :   expression ':' link ;
message           :   sender message_flow recipient ;
sender            :   (activity_link | event_link) ;
recipient         :   (activity_link | event_link | endpoint_link) ;
association       :   (link assoc_flow artifact) | (artifact assoc_flow   link) ;
artifact          :   DVERT_LINE id DVERT_LINE ;
assoc_flow        :   dir_assoc | undir_assoc ;
dir_assoc         :   '->-' ;
undir_assoc       :   '---' ;
sequence_flow     :   '==>' ;
message_flow      :   '-->' ;
input_set         :   IN param_list ;
output_set        :   OUT param_list ;
attr_list         :   attribute (',' attribute)* ;
attribute         :   (namespace_id | id) '=' attr_value ;
attr_value        :   STRING | NUMBER | BOOLEAN ;
param_list        :   param (',' param)* ;
param             :   id ':' param_type ;
param_type        :   'string' | 'boolean' | 'number' | 'date' | 'datetime' | 'time' ;
id                :   ID ;
namespace_id      :   id ':' id ;
link_list         :   link (',' link)* ;
event_links       :   event_link (',' event_link)* ;
link              :   activity_link | event_link | gateway_link ;
activity_link     :   REF SQRE_OPEN id SQRE_CLOSE ;
event_link        :   REF PAREN_OPEN id PAREN_CLOSE ;
gateway_link      :   REF ANGLE_OPEN id ANGLE_CLOSE ;
pool_link         :   REF POOL_OPEN id POOL_CLOSE ;
endpoint_link     :   REF CURLY_OPEN id ('.' id)? CURLY_CLOSE ;
expression        :   '`' (.)*? '`' ;

/* symbols */
POOL_OPEN      :   '((' ;
POOL_CLOSE     :   '))' ;
LANE_OPEN      :   '|[' ;
LANE_CLOSE     :   ']|' ;
CURLY_OPEN     :   '{'  ;
CURLY_CLOSE    :   '}'  ;
SQRE_OPEN      :   '['  ;
SQRE_CLOSE     :   ']'  ;
PAREN_OPEN     :   '('  ;
PAREN_CLOSE    :   ')'  ;
ANGLE_OPEN     :   '<'  ;
ANGLE_CLOSE    :   '>'  ;
STMT_TERM      :   ';'  ;
VERT_LINE      :   '|'  ;
DVERT_LINE     :   '||' ;
REF            :   '#'  ;
X              :   'X'  ;
OR             :  'OR'  ;
XOR            :  'XOR' ;
AND            :  'AND' ;
STAR           :   '*'  ;
PLUS           :   '+'  ;
BLANK          :   '_'  ;
SLASH          :   '/'  ;
DASH           :   '-'  ;
BACKWARD       :   '<<' ;
BANG           :   '!'  ;
QUESTION       :   '?'  ;
CARET          :   '^'  ;
TILDE          :   '~'  ;
AT_SYMB        :   '@'  ;
ELLIPSIS       :   '..' ;
X_BANG         :   'X!' ;

PROCESS        :   [Pp][Rr][Oo][Cc][Ee][Ss][Ss] ;
SUBPROCESS     :   [Ss][Uu][Bb][Pp][Rr][Oo][Cc][Ee][Ss][Ss] ;

/* task types */
USER           :   [Uu][Ss][Ee][Rr] ;
SERVICE        :   [Ss][Ee][Rr][Vv][Ii][Cc][Ee] ;
SCRIPT         :   [Ss][Cc][Rr][Ii][Pp][Tt] ;

CATCH          :   [Cc][Aa][Tt][Cc][Hh] ;
THROW          :   [Tt][Hh][Rr][Oo][Ww] ;

IN             :   [Ii][Nn] ;
OUT            :   [Oo][Uu][Tt] ;
DEFAULT        :   [Dd][Ee][Ff][Aa][Uu][Ll][Tt] ;

FORK           :   [Ff][Oo][Rr][Kk] ;                     /* parallel split (AND) */
XOR_SPLIT      :   [Xx][Oo][Rr]'-'[Ss][Pp][Ll][Ii][Tt] ;  /* exclusive choice (XOR) */
OR_SPLIT       :   [Oo][Rr]'-'[Ss][Pp][Ll][Ii][Tt] ;      /* multiple choice (OR) */
EVENT_SPLIT    :   '(*)' ;                                /* event-based exclusive OR split */
JOIN           :   [Jj][Oo][Ii][Nn] ;                     /* synchronized merge (AND) */
OR_JOIN        :   [Oo][Rr]'-'[Jj}[Oo][Ii][Nn] ;          /* structured synchronized merge (OR) */
XOR_JOIN       :   [Xx][Oo][Rr]'-'[Jj][Oo][Ii][Nn] ;      /* unsynchronized merge (XOR) */

/** any double-quoted string ("...") possibly containing escaped quotes */
STRING      :   '"' ('\\"'|.)*? '"' ;

/** a numeral [-]?(.[0-9]+ | [0-9]+(.[0-9]*)? ) */
NUMBER      :   '-'? ('.' DIGIT+ | DIGIT+ ('.' DIGIT*)? ) ;
fragment
DIGIT       :   [0-9] ;

/** a boolean value */
BOOLEAN     :   'true' | 'false' ;

/** Any string of alphabetic ([a-zA-Z\200-\377]) characters, underscores
 *  ('_') or digits ([0-9]), not beginning with a digit
 */
ID          :   LETTER (LETTER|DIGIT)*;
fragment
LETTER      :   [a-zA-Z\u0080-\u00FF_] ;

COMMENT     :   '/*' .*? '*/'       -> skip ;
LINE_COMMENT:   '//' .*? '\r'? '\n' -> skip ;
/* Skip any whitespace */
WS          :   (' ' | '\t' | '\n' | '\r')+ -> skip ;