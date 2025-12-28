.class public abstract Lx2/j;
.super Lx2/h;
.source "SourceFile"


# direct methods
.method public static final g(Ljava/lang/CharSequence;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static final h(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "string"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_1

    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    new-instance v3, Lu2/d;

    if-gez p2, :cond_2

    move p2, v2

    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-le v0, v2, :cond_3

    move v0, v2

    :cond_3
    const/4 v2, 0x1

    invoke-direct {v3, p2, v0, v2}, Lu2/b;-><init>(III)V

    instance-of p2, p0, Ljava/lang/String;

    iget v0, v3, Lu2/b;->f:I

    iget v2, v3, Lu2/b;->e:I

    iget v3, v3, Lu2/b;->d:I

    if-eqz p2, :cond_7

    if-eqz p1, :cond_7

    if-lez v0, :cond_4

    if-le v3, v2, :cond_5

    :cond_4
    if-gez v0, :cond_b

    if-gt v2, v3, :cond_b

    :cond_5
    :goto_1
    move-object v8, p0

    check-cast v8, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v4, 0x0

    move v5, v3

    move-object v7, p1

    move v9, p3

    invoke-static/range {v4 .. v9}, Lx2/j;->l(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_6

    :goto_2
    move p0, v3

    goto :goto_4

    :cond_6
    if-eq v3, v2, :cond_b

    add-int/2addr v3, v0

    goto :goto_1

    :cond_7
    if-lez v0, :cond_8

    if-le v3, v2, :cond_9

    :cond_8
    if-gez v0, :cond_b

    if-gt v2, v3, :cond_b

    :cond_9
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v5, 0x0

    move-object v4, p1

    move-object v6, p0

    move v7, v3

    move v9, p3

    invoke-static/range {v4 .. v9}, Lx2/j;->m(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_2

    :cond_a
    if-eq v3, v2, :cond_b

    add-int/2addr v3, v0

    goto :goto_3

    :cond_b
    move p0, v1

    :goto_4
    return p0
.end method

.method public static i(Ljava/lang/CharSequence;CIZI)I
    .locals 6

    const/4 v0, 0x1

    and-int/lit8 v1, p4, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move p2, v2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v2

    :cond_1
    const-string p4, "<this>"

    invoke-static {p0, p4}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_3

    instance-of p4, p0, Ljava/lang/String;

    if-nez p4, :cond_2

    goto :goto_0

    :cond_2
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    move-result p0

    goto/16 :goto_6

    :cond_3
    :goto_0
    new-array p4, v0, [C

    aput-char p1, p4, v2

    if-nez p3, :cond_4

    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_4

    aget-char p1, p4, v2

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    move-result p0

    goto :goto_6

    :cond_4
    new-instance p1, Lu2/d;

    if-gez p2, :cond_5

    move p2, v2

    :cond_5
    invoke-static {p0}, Lx2/j;->g(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-direct {p1, p2, v1, v0}, Lu2/b;-><init>(III)V

    iget p1, p1, Lu2/b;->e:I

    if-gt p2, p1, :cond_6

    move v1, v0

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_1
    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    move p2, p1

    :goto_2
    if-eqz v1, :cond_e

    if-ne p2, p1, :cond_9

    if-eqz v1, :cond_8

    move v3, p2

    move v1, v2

    goto :goto_3

    :cond_8
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    :cond_9
    add-int/lit8 v3, p2, 0x1

    :goto_3
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    aget-char v5, p4, v2

    if-ne v5, v4, :cond_a

    goto :goto_5

    :cond_a
    if-nez p3, :cond_b

    goto :goto_4

    :cond_b
    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v5

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    if-eq v5, v4, :cond_d

    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v5

    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    if-ne v5, v4, :cond_c

    goto :goto_5

    :cond_c
    :goto_4
    move p2, v3

    goto :goto_2

    :cond_d
    :goto_5
    move p0, p2

    goto :goto_6

    :cond_e
    const/4 p0, -0x1

    :goto_6
    return p0
.end method

.method public static synthetic j(Ljava/lang/CharSequence;Ljava/lang/String;II)I
    .locals 1

    and-int/lit8 p3, p3, 0x2

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move p2, v0

    :cond_0
    invoke-static {p0, p1, p2, v0}, Lx2/j;->h(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    move-result p0

    return p0
.end method

.method public static final k(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    new-instance v0, Lu2/d;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Lu2/b;-><init>(III)V

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lu2/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    move-object v2, v0

    check-cast v2, Lu2/c;

    iget-boolean v2, v2, Lu2/c;->f:Z

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lu2/c;

    invoke-virtual {v2}, Lu2/c;->a()I

    move-result v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lx/b;->c(C)Z

    move-result v2

    if-nez v2, :cond_1

    move v1, v3

    :cond_2
    :goto_0
    return v1
.end method

.method public static final l(IIILjava/lang/String;Ljava/lang/String;Z)Z
    .locals 6

    const-string v0, "<this>"

    invoke-static {p3, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p4, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p5, :cond_0

    invoke-virtual {p3, p0, p4, p1, p2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p0

    goto :goto_0

    :cond_0
    move-object v0, p3

    move v1, p5

    move v2, p0

    move-object v3, p4

    move v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final m(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p2, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p3, :cond_6

    if-ltz p1, :cond_6

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p1, v1, :cond_6

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p4

    if-le p3, v1, :cond_0

    goto :goto_3

    :cond_0
    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_5

    add-int v2, p1, v1

    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    add-int v3, p3, v1

    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_2

    :cond_1
    if-nez p5, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    if-eq v2, v3, :cond_4

    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    if-ne v2, v3, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    return v0

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    const/4 p0, 0x1

    return p0

    :cond_6
    :goto_3
    return v0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "delimiter"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p0, p1, v0, v1}, Lx2/j;->j(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "substring(...)"

    invoke-static {p0, p1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "missingDelimiterValue"

    invoke-static {p0, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lx2/j;->g(Ljava/lang/CharSequence;)I

    move-result v0

    const/16 v1, 0x2e

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method
