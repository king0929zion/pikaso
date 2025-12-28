.class public final LA0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv0/c;

.field public final b:J

.field public final c:Lv0/A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LM/i;->a:I

    return-void
.end method

.method public constructor <init>(Lv0/c;JLv0/A;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/e;->a:Lv0/c;

    iget-object p1, p1, Lv0/c;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sget v1, Lv0/A;->c:I

    const/16 v1, 0x20

    shr-long v2, p2, v1

    long-to-int v2, v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, LZ/b;->k(III)I

    move-result v4

    const-wide v5, 0xffffffffL

    and-long v7, p2, v5

    long-to-int v7, v7

    invoke-static {v7, v3, v0}, LZ/b;->k(III)I

    move-result v0

    if-ne v4, v2, :cond_0

    if-eq v0, v7, :cond_1

    :cond_0
    invoke-static {v4, v0}, LZ0/d;->e(II)J

    move-result-wide p2

    :cond_1
    iput-wide p2, p0, LA0/e;->b:J

    if-eqz p4, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-wide p2, p4, Lv0/A;->a:J

    shr-long v0, p2, v1

    long-to-int p4, v0

    invoke-static {p4, v3, p1}, LZ/b;->k(III)I

    move-result v0

    and-long v1, p2, v5

    long-to-int v1, v1

    invoke-static {v1, v3, p1}, LZ/b;->k(III)I

    move-result p1

    if-ne v0, p4, :cond_2

    if-eq p1, v1, :cond_3

    :cond_2
    invoke-static {v0, p1}, LZ0/d;->e(II)J

    move-result-wide p2

    :cond_3
    new-instance p1, Lv0/A;

    invoke-direct {p1, p2, p3}, Lv0/A;-><init>(J)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LA0/e;->c:Lv0/A;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA0/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LA0/e;

    iget-wide v3, p1, LA0/e;->b:J

    sget v1, Lv0/A;->c:I

    iget-wide v5, p0, LA0/e;->b:J

    cmp-long v1, v5, v3

    if-nez v1, :cond_2

    iget-object v1, p0, LA0/e;->c:Lv0/A;

    iget-object v3, p1, LA0/e;->c:Lv0/A;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LA0/e;->a:Lv0/c;

    iget-object p1, p1, LA0/e;->a:Lv0/c;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, LA0/e;->a:Lv0/c;

    invoke-virtual {v0}, Lv0/c;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    sget v2, Lv0/A;->c:I

    iget-wide v2, p0, LA0/e;->b:J

    invoke-static {v0, v1, v2, v3}, LA/a;->b(IIJ)I

    move-result v0

    iget-object v1, p0, LA0/e;->c:Lv0/A;

    if-eqz v1, :cond_0

    iget-wide v1, v1, Lv0/A;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextFieldValue(text=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LA0/e;->a:Lv0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', selection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LA0/e;->b:J

    invoke-static {v1, v2}, Lv0/A;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", composition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA0/e;->c:Lv0/A;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
