.class public final Lz0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final e:Lz0/l;

.field public static final f:Lz0/l;

.field public static final g:Lz0/l;

.field public static final h:Lz0/l;


# instance fields
.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lz0/l;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lz0/l;-><init>(I)V

    new-instance v1, Lz0/l;

    const/16 v2, 0xc8

    invoke-direct {v1, v2}, Lz0/l;-><init>(I)V

    new-instance v2, Lz0/l;

    const/16 v3, 0x12c

    invoke-direct {v2, v3}, Lz0/l;-><init>(I)V

    new-instance v3, Lz0/l;

    const/16 v4, 0x190

    invoke-direct {v3, v4}, Lz0/l;-><init>(I)V

    new-instance v4, Lz0/l;

    const/16 v5, 0x1f4

    invoke-direct {v4, v5}, Lz0/l;-><init>(I)V

    new-instance v5, Lz0/l;

    const/16 v6, 0x258

    invoke-direct {v5, v6}, Lz0/l;-><init>(I)V

    sput-object v5, Lz0/l;->e:Lz0/l;

    new-instance v6, Lz0/l;

    const/16 v7, 0x2bc

    invoke-direct {v6, v7}, Lz0/l;-><init>(I)V

    new-instance v7, Lz0/l;

    const/16 v8, 0x320

    invoke-direct {v7, v8}, Lz0/l;-><init>(I)V

    new-instance v8, Lz0/l;

    const/16 v9, 0x384

    invoke-direct {v8, v9}, Lz0/l;-><init>(I)V

    sput-object v3, Lz0/l;->f:Lz0/l;

    sput-object v4, Lz0/l;->g:Lz0/l;

    sput-object v6, Lz0/l;->h:Lz0/l;

    filled-new-array/range {v0 .. v8}, [Lz0/l;

    move-result-object v0

    invoke-static {v0}, Ld2/l;->U([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz0/l;->d:I

    const/4 v0, 0x1

    if-gt v0, p1, :cond_0

    const/16 v0, 0x3e9

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Font weight can be in range [1, 1000]. Current value: "

    invoke-static {v0, p1}, LA/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lz0/l;

    iget v0, p0, Lz0/l;->d:I

    iget p1, p1, Lz0/l;->d:I

    invoke-static {v0, p1}, Lp2/g;->f(II)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz0/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz0/l;

    iget p1, p1, Lz0/l;->d:I

    iget v1, p0, Lz0/l;->d:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lz0/l;->d:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FontWeight(weight="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lz0/l;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
