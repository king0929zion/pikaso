.class public final LD1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/J;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ln/f;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p1, v0}, Ln/F;-><init>(I)V

    .line 4
    iput-object p1, p0, LD1/w;->a:Ljava/lang/Object;

    .line 5
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LD1/w;->c:Ljava/lang/Object;

    .line 6
    new-instance p1, Ln/m;

    const/4 v1, 0x0

    .line 7
    invoke-direct {p1, v1}, Ln/m;-><init>(Ljava/lang/Object;)V

    .line 8
    iput-object p1, p0, LD1/w;->d:Ljava/lang/Object;

    .line 9
    new-instance p1, Ln/f;

    .line 10
    invoke-direct {p1, v0}, Ln/F;-><init>(I)V

    .line 11
    iput-object p1, p0, LD1/w;->b:Ljava/lang/Object;

    return-void

    .line 12
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, LL0/f;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, LL0/f;-><init>(I)V

    iput-object p1, p0, LD1/w;->a:Ljava/lang/Object;

    .line 14
    new-instance p1, Ln/F;

    const/4 v0, 0x0

    .line 15
    invoke-direct {p1, v0}, Ln/F;-><init>(I)V

    .line 16
    iput-object p1, p0, LD1/w;->b:Ljava/lang/Object;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LD1/w;->c:Ljava/lang/Object;

    .line 18
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LD1/w;->d:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lp1/b;)V
    .locals 5

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, LD1/w;->d:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, LD1/w;->a:Ljava/lang/Object;

    .line 22
    new-instance p1, Lo1/s;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lo1/s;-><init>(I)V

    iput-object p1, p0, LD1/w;->c:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 23
    invoke-virtual {p2, p1}, Lp1/c;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 24
    iget v2, p2, Lp1/c;->a:I

    add-int/2addr v0, v2

    .line 25
    iget-object v2, p2, Lp1/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 26
    iget-object v0, p2, Lp1/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 27
    new-array v0, v0, [C

    iput-object v0, p0, LD1/w;->b:Ljava/lang/Object;

    .line 28
    invoke-virtual {p2, p1}, Lp1/c;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 29
    iget v0, p2, Lp1/c;->a:I

    add-int/2addr p1, v0

    .line 30
    iget-object v0, p2, Lp1/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 31
    iget-object p1, p2, Lp1/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_4

    .line 32
    new-instance v0, Lo1/v;

    invoke-direct {v0, p0, p2}, Lo1/v;-><init>(LD1/w;I)V

    .line 33
    invoke-virtual {v0}, Lo1/v;->c()Lp1/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 34
    invoke-virtual {v2, v3}, Lp1/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lp1/c;->b:Ljava/nio/ByteBuffer;

    iget v2, v2, Lp1/c;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    mul-int/lit8 v3, p2, 0x2

    .line 35
    iget-object v4, p0, LD1/w;->b:Ljava/lang/Object;

    check-cast v4, [C

    invoke-static {v2, v4, v3}, Ljava/lang/Character;->toChars(I[CI)I

    .line 36
    invoke-virtual {v0}, Lo1/v;->b()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const-string v4, "invalid metadata codepoint length"

    invoke-static {v2, v4}, LZ/b;->e(ZLjava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Lo1/v;->b()I

    move-result v2

    sub-int/2addr v2, v3

    iget-object v3, p0, LD1/w;->c:Ljava/lang/Object;

    check-cast v3, Lo1/s;

    invoke-virtual {v3, v0, v1, v2}, Lo1/s;->a(Lo1/v;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public constructor <init>(Lp/o;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, LD1/w;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp/t;)V
    .locals 2

    .line 40
    new-instance v0, Lk/H;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Lk/H;-><init>(ILjava/lang/Object;)V

    invoke-direct {p0, v0}, LD1/w;-><init>(Lp/o;)V

    return-void
.end method


# virtual methods
.method public a(Lp/n;Lp/n;Lp/n;)Lp/n;
    .locals 9

    iget-object v0, p0, LD1/w;->d:Ljava/lang/Object;

    check-cast v0, Lp/n;

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lp/n;->c()Lp/n;

    move-result-object v0

    iput-object v0, p0, LD1/w;->d:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, LD1/w;->d:Ljava/lang/Object;

    check-cast v0, Lp/n;

    const/4 v1, 0x0

    const-string v2, "endVelocityVector"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lp/n;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, LD1/w;->d:Ljava/lang/Object;

    check-cast v4, Lp/n;

    if-eqz v4, :cond_1

    iget-object v5, p0, LD1/w;->a:Ljava/lang/Object;

    check-cast v5, Lp/o;

    invoke-interface {v5, v3}, Lp/o;->get(I)Lp/t;

    move-result-object v5

    invoke-virtual {p1, v3}, Lp/n;->a(I)F

    move-result v6

    invoke-virtual {p2, v3}, Lp/n;->a(I)F

    move-result v7

    invoke-virtual {p3, v3}, Lp/n;->a(I)F

    move-result v8

    invoke-interface {v5, v6, v7, v8}, Lp/t;->e(FFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lp/n;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lp2/g;->h(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object p1, p0, LD1/w;->d:Ljava/lang/Object;

    check-cast p1, Lp/n;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    invoke-static {v2}, Lp2/g;->h(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lp2/g;->h(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LD1/w;->b:Ljava/lang/Object;

    check-cast v0, Ln/F;

    invoke-virtual {v0, p1}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3, p2, p3}, LD1/w;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This graph contains cyclic dependencies"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lp/n;Lp/n;Lp/n;)J
    .locals 7

    invoke-virtual {p1}, Lp/n;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LZ/b;->R(II)Lu2/d;

    move-result-object v0

    invoke-virtual {v0}, Lu2/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    move-object v3, v0

    check-cast v3, Lu2/c;

    iget-boolean v3, v3, Lu2/c;->f:Z

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lu2/c;

    invoke-virtual {v3}, Lu2/c;->a()I

    move-result v3

    iget-object v4, p0, LD1/w;->a:Ljava/lang/Object;

    check-cast v4, Lp/o;

    invoke-interface {v4, v3}, Lp/o;->get(I)Lp/t;

    move-result-object v4

    invoke-virtual {p1, v3}, Lp/n;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Lp/n;->a(I)F

    move-result v6

    invoke-virtual {p3, v3}, Lp/n;->a(I)F

    move-result v3

    invoke-interface {v4, v5, v6, v3}, Lp/t;->d(FFF)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public e(JLp/n;Lp/n;Lp/n;)Lp/n;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LD1/w;->c:Ljava/lang/Object;

    check-cast v1, Lp/n;

    if-nez v1, :cond_0

    invoke-virtual/range {p5 .. p5}, Lp/n;->c()Lp/n;

    move-result-object v1

    iput-object v1, v0, LD1/w;->c:Ljava/lang/Object;

    :cond_0
    iget-object v1, v0, LD1/w;->c:Ljava/lang/Object;

    check-cast v1, Lp/n;

    const/4 v2, 0x0

    const-string v3, "velocityVector"

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lp/n;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    iget-object v5, v0, LD1/w;->c:Ljava/lang/Object;

    check-cast v5, Lp/n;

    if-eqz v5, :cond_1

    iget-object v6, v0, LD1/w;->a:Ljava/lang/Object;

    check-cast v6, Lp/o;

    invoke-interface {v6, v4}, Lp/o;->get(I)Lp/t;

    move-result-object v7

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lp/n;->a(I)F

    move-result v10

    move-object/from16 v13, p4

    invoke-virtual {v13, v4}, Lp/n;->a(I)F

    move-result v11

    move-object/from16 v14, p5

    invoke-virtual {v14, v4}, Lp/n;->a(I)F

    move-result v12

    move-wide/from16 v8, p1

    invoke-interface/range {v7 .. v12}, Lp/t;->c(JFFF)F

    move-result v7

    invoke-virtual {v5, v4, v7}, Lp/n;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lp2/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_2
    iget-object v1, v0, LD1/w;->c:Ljava/lang/Object;

    check-cast v1, Lp/n;

    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    invoke-static {v3}, Lp2/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, Lp2/g;->h(Ljava/lang/String;)V

    throw v2
.end method

.method public f(JLp/n;Lp/n;Lp/n;)Lp/n;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LD1/w;->b:Ljava/lang/Object;

    check-cast v1, Lp/n;

    if-nez v1, :cond_0

    invoke-virtual/range {p3 .. p3}, Lp/n;->c()Lp/n;

    move-result-object v1

    iput-object v1, v0, LD1/w;->b:Ljava/lang/Object;

    :cond_0
    iget-object v1, v0, LD1/w;->b:Ljava/lang/Object;

    check-cast v1, Lp/n;

    const/4 v2, 0x0

    const-string v3, "valueVector"

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lp/n;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    iget-object v5, v0, LD1/w;->b:Ljava/lang/Object;

    check-cast v5, Lp/n;

    if-eqz v5, :cond_1

    iget-object v6, v0, LD1/w;->a:Ljava/lang/Object;

    check-cast v6, Lp/o;

    invoke-interface {v6, v4}, Lp/o;->get(I)Lp/t;

    move-result-object v7

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lp/n;->a(I)F

    move-result v10

    move-object/from16 v13, p4

    invoke-virtual {v13, v4}, Lp/n;->a(I)F

    move-result v11

    move-object/from16 v14, p5

    invoke-virtual {v14, v4}, Lp/n;->a(I)F

    move-result v12

    move-wide/from16 v8, p1

    invoke-interface/range {v7 .. v12}, Lp/t;->b(JFFF)F

    move-result v7

    invoke-virtual {v5, v4, v7}, Lp/n;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lp2/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_2
    iget-object v1, v0, LD1/w;->b:Ljava/lang/Object;

    check-cast v1, Lp/n;

    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    invoke-static {v3}, Lp2/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, Lp2/g;->h(Ljava/lang/String;)V

    throw v2
.end method
