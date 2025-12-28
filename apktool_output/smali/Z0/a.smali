.class public final LZ0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ0/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LZ0/a;->a:LZ0/a;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    invoke-static {p1}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    move-result p1

    return p1
.end method
