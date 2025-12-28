.class public final LA/N;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:LP/l;

.field public final synthetic g:J

.field public final synthetic h:J

.field public final synthetic i:Lz0/j;

.field public final synthetic j:Lz0/l;

.field public final synthetic k:Lz0/r;

.field public final synthetic l:J

.field public final synthetic m:LF0/g;

.field public final synthetic n:LF0/f;

.field public final synthetic o:J

.field public final synthetic p:I

.field public final synthetic q:Z

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:Lo2/c;

.field public final synthetic u:Lv0/B;

.field public final synthetic v:I

.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public constructor <init>(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;III)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LA/N;->e:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, LA/N;->f:LP/l;

    move-wide v1, p3

    iput-wide v1, v0, LA/N;->g:J

    move-wide v1, p5

    iput-wide v1, v0, LA/N;->h:J

    move-object v1, p7

    iput-object v1, v0, LA/N;->i:Lz0/j;

    move-object v1, p8

    iput-object v1, v0, LA/N;->j:Lz0/l;

    move-object v1, p9

    iput-object v1, v0, LA/N;->k:Lz0/r;

    move-wide v1, p10

    iput-wide v1, v0, LA/N;->l:J

    move-object v1, p12

    iput-object v1, v0, LA/N;->m:LF0/g;

    move-object/from16 v1, p13

    iput-object v1, v0, LA/N;->n:LF0/f;

    move-wide/from16 v1, p14

    iput-wide v1, v0, LA/N;->o:J

    move/from16 v1, p16

    iput v1, v0, LA/N;->p:I

    move/from16 v1, p17

    iput-boolean v1, v0, LA/N;->q:Z

    move/from16 v1, p18

    iput v1, v0, LA/N;->r:I

    move/from16 v1, p19

    iput v1, v0, LA/N;->s:I

    move-object/from16 v1, p20

    iput-object v1, v0, LA/N;->t:Lo2/c;

    move-object/from16 v1, p21

    iput-object v1, v0, LA/N;->u:Lv0/B;

    move/from16 v1, p22

    iput v1, v0, LA/N;->v:I

    move/from16 v1, p23

    iput v1, v0, LA/N;->w:I

    move/from16 v1, p24

    iput v1, v0, LA/N;->x:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v22, p1

    check-cast v22, LD/n;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    iget v1, v0, LA/N;->v:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LD/d;->J(I)I

    move-result v23

    iget v1, v0, LA/N;->w:I

    invoke-static {v1}, LD/d;->J(I)I

    move-result v24

    iget v1, v0, LA/N;->s:I

    move/from16 v19, v1

    iget v1, v0, LA/N;->x:I

    move/from16 v25, v1

    iget-object v1, v0, LA/N;->e:Ljava/lang/String;

    iget-object v2, v0, LA/N;->f:LP/l;

    iget-wide v3, v0, LA/N;->g:J

    iget-wide v5, v0, LA/N;->h:J

    iget-object v7, v0, LA/N;->i:Lz0/j;

    iget-object v8, v0, LA/N;->j:Lz0/l;

    iget-object v9, v0, LA/N;->k:Lz0/r;

    iget-wide v10, v0, LA/N;->l:J

    iget-object v12, v0, LA/N;->m:LF0/g;

    iget-object v13, v0, LA/N;->n:LF0/f;

    iget-wide v14, v0, LA/N;->o:J

    move-object/from16 p1, v1

    iget v1, v0, LA/N;->p:I

    move/from16 v16, v1

    iget-boolean v1, v0, LA/N;->q:Z

    move/from16 v17, v1

    iget v1, v0, LA/N;->r:I

    move/from16 v18, v1

    iget-object v1, v0, LA/N;->t:Lo2/c;

    move-object/from16 v20, v1

    iget-object v1, v0, LA/N;->u:Lv0/B;

    move-object/from16 v21, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v25}, LA/O;->b(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;LD/n;III)V

    sget-object v1, Lc2/m;->a:Lc2/m;

    return-object v1
.end method
