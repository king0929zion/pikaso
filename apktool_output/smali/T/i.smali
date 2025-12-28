.class public final Lt/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/k;


# instance fields
.field public final a:LP/d;

.field public final b:Z


# direct methods
.method public constructor <init>(LP/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/i;->a:LP/d;

    iput-boolean p2, p0, Lt/i;->b:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt/i;

    iget-object v1, p1, Lt/i;->a:LP/d;

    iget-object v3, p0, Lt/i;->a:LP/d;

    invoke-virtual {v3, v1}, LP/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lt/i;->b:Z

    iget-boolean p1, p1, Lt/i;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f(Ln0/L;Ljava/util/List;J)LM1/j;
    .locals 16

    move-object/from16 v7, p1

    move-object/from16 v2, p2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    sget-object v8, Ld2/t;->d:Ld2/t;

    if-eqz v0, :cond_0

    invoke-static/range {p3 .. p4}, LG0/a;->j(J)I

    move-result v0

    invoke-static/range {p3 .. p4}, LG0/a;->i(J)I

    move-result v1

    sget-object v2, Lt/f;->e:Lt/f;

    invoke-virtual {v7, v0, v1, v8, v2}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v9, p0

    iget-boolean v0, v9, Lt/i;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-wide/from16 v3, p3

    move-wide v5, v3

    goto :goto_0

    :cond_1
    move-wide/from16 v3, p3

    invoke-static {v1, v1, v3, v4}, LG0/a;->a(IIJ)J

    move-result-wide v5

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v10, 0x1

    if-ne v0, v10, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll0/j;

    invoke-interface {v2}, Ll0/j;->o()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lt/d;

    invoke-interface {v2, v5, v6}, Ll0/j;->a(J)Ll0/o;

    move-result-object v1

    invoke-static/range {p3 .. p4}, LG0/a;->j(J)I

    move-result v0

    iget v5, v1, Ll0/o;->d:I

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-static/range {p3 .. p4}, LG0/a;->i(J)I

    move-result v0

    iget v3, v1, Ll0/o;->e:I

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v11

    new-instance v12, Lt/g;

    move-object v0, v12

    move-object/from16 v3, p1

    move v4, v10

    move v5, v11

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v6}, Lt/g;-><init>(Ll0/o;Ll0/j;Ln0/L;IILt/i;)V

    invoke-virtual {v7, v10, v11, v8, v12}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v10, v0, [Ll0/o;

    new-instance v11, Lp2/n;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p3 .. p4}, LG0/a;->j(J)I

    move-result v0

    iput v0, v11, Lp2/n;->d:I

    new-instance v12, Lp2/n;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p3 .. p4}, LG0/a;->i(J)I

    move-result v0

    iput v0, v12, Lp2/n;->d:I

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_3

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/j;

    invoke-interface {v3}, Ll0/j;->o()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Lt/d;

    invoke-interface {v3, v5, v6}, Ll0/j;->a(J)Ll0/o;

    move-result-object v3

    aput-object v3, v10, v1

    iget v4, v11, Lp2/n;->d:I

    iget v13, v3, Ll0/o;->d:I

    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v11, Lp2/n;->d:I

    iget v4, v12, Lp2/n;->d:I

    iget v3, v3, Ll0/o;->e:I

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v12, Lp2/n;->d:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget v13, v11, Lp2/n;->d:I

    iget v14, v12, Lp2/n;->d:I

    new-instance v15, Lt/h;

    move-object v0, v15

    move-object v1, v10

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    move-object v4, v11

    move-object v5, v12

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v6}, Lt/h;-><init>([Ll0/o;Ljava/util/List;Ln0/L;Lp2/n;Lp2/n;Lt/i;)V

    invoke-virtual {v7, v13, v14, v8, v15}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lt/i;->a:LP/d;

    invoke-virtual {v0}, LP/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lt/i;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BoxMeasurePolicy(alignment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt/i;->a:LP/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", propagateMinConstraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lt/i;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
