.class public final LF/e;
.super Li2/i;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public f:[Ljava/lang/Object;

.field public g:[J

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:LF/f;


# direct methods
.method public constructor <init>(LF/f;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LF/e;->o:LF/f;

    invoke-direct {p0, p2}, Li2/i;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 2

    new-instance v0, LF/e;

    iget-object v1, p0, LF/e;->o:LF/f;

    invoke-direct {v0, v1, p1}, LF/e;-><init>(LF/f;Lg2/d;)V

    iput-object p2, v0, LF/e;->n:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw2/g;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LF/e;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LF/e;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LF/e;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LF/e;->m:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget v2, v0, LF/e;->k:I

    iget v6, v0, LF/e;->j:I

    iget-wide v7, v0, LF/e;->l:J

    iget v9, v0, LF/e;->i:I

    iget v10, v0, LF/e;->h:I

    iget-object v11, v0, LF/e;->g:[J

    iget-object v12, v0, LF/e;->f:[Ljava/lang/Object;

    iget-object v13, v0, LF/e;->n:Ljava/lang/Object;

    check-cast v13, Lw2/g;

    invoke-static/range {p1 .. p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object v2, v0, LF/e;->n:Ljava/lang/Object;

    check-cast v2, Lw2/g;

    iget-object v6, v0, LF/e;->o:LF/f;

    iget-object v6, v6, LF/f;->d:Ln/B;

    iget-object v7, v6, Ln/B;->b:[Ljava/lang/Object;

    iget-object v6, v6, Ln/B;->a:[J

    array-length v8, v6

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_5

    move v9, v4

    :goto_0
    aget-wide v10, v6, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_4

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    move-object v13, v2

    move v2, v4

    move-wide/from16 v18, v10

    move-object v11, v6

    move v10, v8

    move v6, v12

    move-object v12, v7

    move-wide/from16 v7, v18

    :goto_1
    if-ge v2, v6, :cond_3

    const-wide/16 v14, 0xff

    and-long/2addr v14, v7

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_2

    shl-int/lit8 v4, v9, 0x3

    add-int/2addr v4, v2

    aget-object v4, v12, v4

    iput-object v13, v0, LF/e;->n:Ljava/lang/Object;

    iput-object v12, v0, LF/e;->f:[Ljava/lang/Object;

    iput-object v11, v0, LF/e;->g:[J

    iput v10, v0, LF/e;->h:I

    iput v9, v0, LF/e;->i:I

    iput-wide v7, v0, LF/e;->l:J

    iput v6, v0, LF/e;->j:I

    iput v2, v0, LF/e;->k:I

    iput v3, v0, LF/e;->m:I

    invoke-virtual {v13, v4, v0}, Lw2/g;->b(Ljava/lang/Object;Li2/i;)V

    return-object v1

    :cond_2
    :goto_2
    shr-long/2addr v7, v5

    add-int/2addr v2, v3

    goto :goto_1

    :cond_3
    if-ne v6, v5, :cond_5

    move v8, v10

    move-object v6, v11

    move-object v7, v12

    move-object v2, v13

    :cond_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    sget-object v1, Lc2/m;->a:Lc2/m;

    return-object v1
.end method
