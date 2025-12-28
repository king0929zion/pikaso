.class public final Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/k;
.implements Lt/r;


# instance fields
.field public final a:LP/b;


# direct methods
.method public constructor <init>(LP/b;)V
    .locals 1

    sget-object v0, Lt/c;->a:Ls1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/l;->a:LP/b;

    return-void
.end method


# virtual methods
.method public final a([Ll0/o;Ln0/L;[III)LM1/j;
    .locals 7

    new-instance v6, Lt/k;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    move v3, p5

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lt/k;-><init>([Ll0/o;Lt/l;ILn0/L;[I)V

    sget-object p1, Ld2/t;->d:Ld2/t;

    invoke-virtual {p2, p5, p4, p1, v6}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1
.end method

.method public final b(IIZ)J
    .locals 3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    invoke-static {v0, p2, v0, p1}, La/a;->a(IIII)J

    move-result-wide p1

    goto :goto_3

    :cond_0
    const p3, 0x3fffe

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    const v2, 0x7fffffff

    if-ne p1, v2, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    if-ne p1, v2, :cond_2

    move p3, v1

    goto :goto_1

    :cond_2
    move p3, p1

    :goto_1
    invoke-static {p3}, La/a;->h(I)I

    move-result p3

    if-ne p2, v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_2
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p2, v2, v1, p1}, La/a;->a(IIII)J

    move-result-wide p1

    :goto_3
    return-wide p1
.end method

.method public final c(Ll0/o;)I
    .locals 0

    iget p1, p1, Ll0/o;->d:I

    return p1
.end method

.method public final d(Ll0/o;)I
    .locals 0

    iget p1, p1, Ll0/o;->e:I

    return p1
.end method

.method public final e(I[I[ILn0/L;)V
    .locals 0

    sget-object p1, Lt/c;->a:Ls1/c;

    const/4 p1, 0x0

    invoke-static {p2, p3, p1}, Lt/c;->b([I[IZ)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lt/c;->b:Ls1/c;

    invoke-virtual {v1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lt/l;->a:LP/b;

    iget-object p1, p1, Lt/l;->a:LP/b;

    invoke-virtual {v1, p1}, LP/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f(Ln0/L;Ljava/util/List;J)LM1/j;
    .locals 10

    invoke-static {p3, p4}, LG0/a;->i(J)I

    move-result v1

    invoke-static {p3, p4}, LG0/a;->j(J)I

    move-result v2

    invoke-static {p3, p4}, LG0/a;->g(J)I

    move-result v3

    invoke-static {p3, p4}, LG0/a;->h(J)I

    move-result v4

    sget-object p3, Lt/c;->a:Ls1/c;

    const/4 p3, 0x0

    int-to-float p3, p3

    invoke-interface {p1, p3}, LG0/b;->b(F)I

    move-result v5

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    new-array v8, p3, [Ll0/o;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v9

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LZ0/d;->F(Lt/r;IIIIILn0/L;Ljava/util/List;[Ll0/o;I)LM1/j;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 2

    sget-object v0, Lt/c;->b:Ls1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt/l;->a:LP/b;

    iget v1, v1, LP/b;->a:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ColumnMeasurePolicy(verticalArrangement="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lt/c;->b:Ls1/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt/l;->a:LP/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
