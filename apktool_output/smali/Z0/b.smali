.class public abstract LZ0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, LZ0/a;->a:LZ0/a;

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    invoke-virtual {v1, v2}, LZ0/a;->a(I)I

    :cond_0
    if-lt v0, v2, :cond_1

    const/16 v3, 0x1f

    invoke-virtual {v1, v3}, LZ0/a;->a(I)I

    :cond_1
    if-lt v0, v2, :cond_2

    const/16 v3, 0x21

    invoke-virtual {v1, v3}, LZ0/a;->a(I)I

    :cond_2
    if-lt v0, v2, :cond_3

    const v0, 0xf4240

    invoke-virtual {v1, v0}, LZ0/a;->a(I)I

    :cond_3
    return-void
.end method

.method public static final a()Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_2

    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "CODENAME"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "REL"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {v0, v2}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "Tiramisu"

    invoke-virtual {v3, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    return v0
.end method
